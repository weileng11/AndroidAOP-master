package zj.it.bhne.androidaop;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.zj.singclick.SingleClick;


/**
 * 详细说明
 * https://www.jianshu.com/p/a57fe84666be
 */
public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button zhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        zhu = findViewById(R.id.zhu);

        zhu.setOnClickListener(this);
    }

    @SingleClick
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zhu:
                ToastUtils.showShort("sssss");
                Log.e("刘佩希","wwww");
                break;
        }
    }
}
