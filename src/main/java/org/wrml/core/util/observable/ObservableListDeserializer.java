package org.wrml.core.util.observable;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.deser.std.*;
import org.codehaus.jackson.type.JavaType;

public class ObservableListDeserializer extends CollectionDeserializer
{
	private JavaType jtype;
	
	protected ObservableListDeserializer(CollectionDeserializer src)
    {
	    super(src);
	    
	    this.jtype = src.getContentType();

    }

	@Override
	public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt, TypeDeserializer typeDeserializer)
	        throws IOException, JsonProcessingException
	{
		ObservableList olist = (ObservableList) Proxy.newProxyInstance(ObservableList.class.getClassLoader(),
				new Class[] {ObservableList.class},
				new InvocationHandler()
				{
					
					@Override
					public Object invoke(Object obj, Method method, Object[] args) throws Throwable
					{
						// TODO Auto-generated method stub
						return null;
					}
				}
		);
		
		
		// TODO Auto-generated method stub
	    return super.deserializeWithType(jp, ctxt, typeDeserializer);
	}
}
