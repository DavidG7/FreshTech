import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;


public class MongoDatabaseController 
{	
	//MongoDB Variables
	static String mongohost = "10.50.15.34";
	static int port = 27017;
	static MongoClient mongoClient;
	static DB db;	
	
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
	/*try{
		
		
		 DBCursor cursor = coll.find();
        int i=1;
        while (cursor.hasNext()) { 
           System.out.println("Inserted Document: "+i); 
           System.out.println(cursor.next()); 
           i++;
        }
     }catch(Exception e){
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	}*/
	
}
