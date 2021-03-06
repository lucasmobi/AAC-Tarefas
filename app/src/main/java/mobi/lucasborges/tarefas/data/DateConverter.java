package mobi.lucasborges.tarefas.data;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

/**
 * Created by Lucas Borges on 31/08/17.
 */

public class DateConverter {
    @TypeConverter
    public static Date toDate(Long timestamp){
        return timestamp == null ? null : new Date(timestamp);
    }

    @TypeConverter
    public static Long toTimestamp(Date date){
        return date == null ? null : date.getTime();
    }
}
