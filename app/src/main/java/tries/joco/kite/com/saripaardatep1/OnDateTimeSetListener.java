package tries.joco.kite.com.saripaardatep1;

/**
 * Created by meste on 2016. 12. 07..
 */
import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;

public abstract class OnDateTimeSetListener implements OnDateSetListener {

    @Override
    public abstract void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth);

}
