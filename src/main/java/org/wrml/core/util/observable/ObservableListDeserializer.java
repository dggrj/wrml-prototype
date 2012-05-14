package org.wrml.core.util.observable;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.std.CollectionDeserializer;

public class ObservableListDeserializer extends CollectionDeserializer
{
	protected ObservableListDeserializer(CollectionDeserializer src)
    {
	    super(src);
    }
		
	@Override
	public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
	        throws IOException, JsonProcessingException
	{
		OListInvHandler handler = new OListInvHandler(getContentType().getRawClass());
		
		@SuppressWarnings("rawtypes")
        ObservableList olist = (ObservableList) Proxy.newProxyInstance( ObservableList.class.getClassLoader(),
																		new Class[] {ObservableList.class},
																		handler
																	);
		
		
		// TODO Auto-generated method stub
	    return super.deserializeWithType(jp, ctxt, typeDeserializer);
	}
	
	public class OListInvHandler implements InvocationHandler
	{
		@SuppressWarnings("rawtypes")
        private List list;
		private List<ListEventListener> listeners;
		
		public <T> OListInvHandler(Class<T> type)
        {
		    list = new ArrayList<T>();
		    listeners = new ArrayList<ListEventListener>();
        }

		@Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
        {
			String methName = method.getName();
			
			if (methName.endsWith("EventListener"))
			{
				if (methName.startsWith("add"))
				{
					return listeners.add((ListEventListener)args[0]);
				}
				else if (methName.startsWith("remove"))
				{
					return listeners.remove((ListEventListener)args[0]);
				}
				else
				{
					throw new NoSuchMethodException();
				}
			}
			else
			{
				return method.invoke(list, args);
			}
        }
	}
}
