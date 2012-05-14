package org.wrml.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wrml.core.Model;
import org.wrml.core.io.JsonParserModelGraphReader;
import org.wrml.core.model.schema.Schema;
import org.wrml.core.runtime.Context;
import org.wrml.core.runtime.ModelGraph;
import org.wrml.core.runtime.bootstrap.DomainConfig;

public class JsonParserModelGraphTest
{
	private final static String fileSep = File.separator;
	private final static String simplefilename = 
			"src" + fileSep + "test" + fileSep + "resources" + fileSep + "simple.json";
	
	private File simple;
	
	private JsonParserModelGraphReader reader;
	
	private Context context;
	
	@Before
	public void setup()
	{
		simple = new File(simplefilename);
		reader = new JsonParserModelGraphReader();
		DomainConfig domainConfig = new DomainConfig();
		//TODO setup domain config
		
		context = new Context(domainConfig);
	}
	

    @After
    public void teardown()
	{
		simple = null;
		reader.free();
	}
	
	@Test
	public void testOpen() throws FileNotFoundException, Exception
	{
		reader.open(new FileInputStream(simple));
		
		ModelGraph mg = reader.readModelGraph(context, Schema.class);
		Model m = mg.getRoot();

	}
}
