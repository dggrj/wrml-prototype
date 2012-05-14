package org.wrml.core.model.schema;

import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.wrml.core.Hyperlink;
import org.wrml.core.Model;
import org.wrml.core.model.Document;
import org.wrml.core.model.DocumentMetadata;
import org.wrml.core.model.DocumentOptions;
import org.wrml.core.model.api.ResourceTemplate;
import org.wrml.core.runtime.Context;
import org.wrml.core.runtime.ModelGraph;
import org.wrml.core.runtime.bootstrap.DomainConfig;
import org.wrml.core.runtime.event.FieldEventListener;
import org.wrml.core.runtime.event.ModelEventListener;
import org.wrml.core.service.APISpecification;
import org.wrml.core.util.observable.ObservableList;
import org.wrml.core.util.observable.ObservableMap;
import org.wrml.core.www.MediaType;

public class SchemaImpl implements Schema
{

	@Override
	public String getName()
	{
		return "schemaName";
	}

	@Override
	public void setName(String name)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void absorb(Model modelToAbsorb, Model... additionalModelsToAbsorb)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addEventListener(ModelEventListener listener)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addFieldEventListener(String fieldName, FieldEventListener listener)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object clickLink(URI rel, Type nativeReturnType, Object requestEntity, Map<String, String> hrefParams)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void extend(Model modelToExtend, Model... additionalModelsToExtend)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void free()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Context getContext()
	{
		DomainConfig cfg = new DomainConfig();
		cfg.setApiSpecifications(new ArrayList<APISpecification>());
		cfg.setDomainConfig(new HashMap<String, String>());
		Context ctx = new Context(cfg);
		
		return ctx;
	}

	@Override
	public Model getDynamicInterface()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getFieldValue(String fieldName)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableMap<URI, Hyperlink> getHyperLinks()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MediaType getMediaType()
	{
		MediaType mt = MediaType.create("application/wrml");
		return mt;
	}

	@Override
	public ModelGraph getModelGraph()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getNativeType()
	{
		// TODO Auto-generated method stub
		return this.getClass().getGenericSuperclass();
	}

	@Override
	public Type[] getNativeTypeParameters()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceTemplate getResourceTemplate()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getResourceTemplateId()
	{
		// TODO Auto-generated method stub
		return URI.create("http://uri.com/resourceTemplates/5");
	}

	@Override
	public Schema getSchema()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getSchemaId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Model getStaticInterface()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeEventListener(ModelEventListener listener)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFieldEventListener(String fieldName, FieldEventListener listener)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAllFieldsToDefaultValue()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setFieldToDefaultValue(String fieldName)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setFieldValue(String fieldName, Object fieldValue)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public long getVersion()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription()
	{
		// TODO Auto-generated method stub
		return "this is an attempt to look at a schema implementation";
	}

	@Override
	public void setDescription(String description)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public ObservableList<Constraint<Schema>> getConstraints()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public String getEtag()
	{
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

	@Override
	public URI getId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentMetadata getMetadata()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentOptions getOptions()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document getParent()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getSecondsToLive()
	{
		// TODO Auto-generated method stub
		return 150l;
	}

	@Override
	public void setSecondsToLive(Long secondsToLive)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Document getSelf()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReadOnly()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEtag(String etag)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setId(URI id)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setReadOnly(boolean readOnly)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Document update()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableList<URI> getBaseSchemaIds()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableList<Field> getFields()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObservableList<Link> getLinks()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
