package examples;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.index.IndexManager;
import org.neo4j.logging.Log;
import org.neo4j.procedure.Context;
import org.neo4j.graphdb.Node;

import java.util.Map;

import static org.neo4j.helpers.collection.MapUtil.stringMap;

/**
 * This is an example showing how you could expose Neo4j's full text indexes as
 * two procedures - one for updating indexes, and one for querying by label and
 * the lucene query language.
 */
public class FinalValue
{
    @Context
    public GraphDatabaseService db;

    @Context
    public Log log;

  /*  public static class SearchHit
    {
        // This records contain a single field named 'nodeId'
        public long nodeId;

        public SearchHit( Node node )
        {
            this.nodeId = node.getId();
        }
    }*/

}