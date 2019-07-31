package com.example.secondproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.app.TimePickerDialog;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;

public class AddReminderActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    private static final  int EXISTING_VECHICLE_LOADER=0;
    private Toolbar mToolbar;
    private EditText mTitleText;
    private TextView mDateText,mTimeText,mRepeatText,mRepeatNoText,mRepeatTypeText;
    private FloatingActionButton mFAB1,mFAB2;
    private Calendar mCalender;
    private int mYear,mMonth,mHour,mMinute,mDay;
    private long mRepeatTime;
    private Switch mRepeatSwitch;
    private String mTitle,mTime,mDate,mRepeat,mRepeatNo,mRepeatType,mActive;
    private Uri mCurrentReminderUri;
    private boolean mVechileHasChanged=false;

    public final static String KEY_TITLE="title_key";
    public final static String KEY_DATE="date_key";
    public final static String KEY_TIME="time_key";
    public final static String KEY_REPEAT="repeat_key";
    public final static String KEY_REPEAT_NO="repeat_no_key";
    public final static String KEY_REPEAT_TYPE="repeat_type_key";
    public final static String KEY_ACTIVE="active_key";

    private static final long milMinute=60000L;
    private static final long milHour=360000000L;
    private static final long milDay=86400000L;
    private static final long milWeek=604800000L;
    private static final long milMonth=2592000000L;

    private View.OnTouchListener mTouchListener=(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            mVechileHasChanged=true;
            return true;
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_reminder);
        if(mCurrentReminderUri==null)
        {
            setTitle("Add Reminder Details");
        }
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {

    }
}
