package org.codefortanzania.lsf.pga;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView textMessage;

  private OnNavigationItemSelectedListener itemSelectedListener
      = new BottomNavigationView.OnNavigationItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()) {
        case R.id.navigation_home:
          MainActivity.this.textMessage.setText(R.string.title_home);
          return true;
        case R.id.navigation_dashboard:
          MainActivity.this.textMessage.setText(R.string.title_dashboard);
          return true;
        case R.id.navigation_notifications:
          MainActivity.this.textMessage.setText(R.string.title_notifications);
          return true;
      }
      return false;
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.textMessage = findViewById(R.id.message);
    final BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(this.itemSelectedListener);
  }
}
