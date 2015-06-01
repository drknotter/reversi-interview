package com.kamcord.reversi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ReversiActivity extends ActionBarActivity {

    private enum SpotState {
        BLANK,
        DARK,
        LIGHT,
    }
    SpotState[][] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reversi);

        this.board = new SpotState[8][8];

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                final int finalx = x;
                final int finaly = y;
                int viewId = getResources().getIdentifier("position_" + finalx + "_" + finaly, "id", getPackageName());
                View spot = findViewById(viewId);
                spot.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onPositionedClicked(finalx, finaly);
                    }
                });
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reversi, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void onPositionedClicked(int x, int y) {
    }
}
