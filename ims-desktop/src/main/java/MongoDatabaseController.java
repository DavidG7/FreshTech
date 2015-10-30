import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class MongoDatabaseController 
{
	static String mongohost = "10.50.15.37";
	static int port = 27017;
	static MongoClient mongoClient;
	DB db;	
	
	@SuppressWarnings("deprecation")
	public MongoDatabaseController()
	{
		mongoClient = new MongoClient(mongohost, port);
		db = mongoClient.getDB("FreshTech");
	}
	
	public DB getMongoDB()
	{
		return db;
	}
	
	public DBCollection getDBCollection(String collectionName)
	{
		DBCollection coll = null;
		
		if(db.collectionExists(collectionName))
		{
			coll = db.getCollection(collectionName);
		}		
		return coll;
	}
}
