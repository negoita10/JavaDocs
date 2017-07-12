package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alexandru.Negoita on 7/12/2017.
 */
public class EntityUtilsTest {
    @Test
    public void testGetTableNameMethod() {
        String tableName = EntityUtils.getTableName(Department.class);
        assertEquals("Table name should be departments!", "departments", tableName);
        assertEquals("Table name should location","Locations", tableName);
    }

    public void testGetColumns(){

    }

}
