package example.tacademy.com.sampledesignsupport;

import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView naviView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        naviView = (NavigationView)findViewById(R.id.navigation_view);
//        무조건 0으로 해줘라!
        View headerView = naviView.getHeaderView(0);
        TextView nameView = (TextView)headerView.findViewById(R.id.text_name);
        nameView.setText("KSJ");
        naviView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_add:
            case R.id.menu_delete:
            case R.id.menu_get:
                Toast.makeText(this,"menu : " + item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
