package ro.teamnet.zth.api.em;

import com.sun.istack.internal.NotNull;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexandru.Negoita on 7/12/2017.
 */
public class EntityUtils {
    private EntityUtils() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }

    public static String getTableName(Class entity)
    {
        Table t= (Table) entity.getAnnotation(Table.class);
        if(t.getClass().getName().equals(null))
            return entity.getName();

        return t.name();

    }

    public static List<ColumnInfo> getColumns(Class entity) {
        List<ColumnInfo> list = new LinkedList<>();
        for (Field f : entity.getDeclaredFields()) {
            Column columnObj = (Column) f.getAnnotation(Id.class);
            Id idObj = f.getAnnotation(Id.class);

            ColumnInfo columnInfoObj = new ColumnInfo();
            columnInfoObj.setColumnName(f.getName());
            if (columnObj != null) {
                columnInfoObj.setDbColumnName(columnObj.name());
                columnInfoObj.setId(false);
            } else {
                columnInfoObj.setDbColumnName(idObj.name());
                columnInfoObj.setId(true);
            }

            columnInfoObj.setColumnType(f.getType());
            list.add(columnInfoObj);
        }

        return list;
    }

    public static Object castFromSqlType(Object value,Class wantedType)
    {
        if(value instanceof BigDecimal && wantedType.equals(Integer.class)){
            return (Integer) value;}
        if(value instanceof BigDecimal && wantedType.equals(Long.class)){
            return (Long) value;}
        if(value instanceof BigDecimal && wantedType.equals(Float.class)){
            return (Float) value;}
        if(value instanceof BigDecimal && wantedType.equals(Double.class)){
            return (double) value;}
        else
            return value;
    }

    public static List<Field> getFieldsByAnnotations(Class clazz,Class annotation)
    {
      List<Field> list = new ArrayList<Field>();
      Field[] fil = clazz.getDeclaredFields();
        for (Field it:fil)
        {
            if(it.getAnnotation(annotation)!=null)
                list.add(it);
        }
        return list;
    }

    public static Object getSqlValue(Object object)
    {
        Field[] f = object.getClass().getDeclaredFields();
        for (Field it:f)
        {
             if(it.isAnnotationPresent(Id.class))
                 it.setAccessible(true);
                 return it.getType();
        }
        return object;
    }
}