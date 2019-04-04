package br.com.emerson.mylibraryall;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastJava {


    public void showToast(Context context, String menssagem){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customToastroot = inflater.inflate(R.custom_toast, null);

        Toast customtoast = new Toast(context);

        customtoast.setView(customToastroot);
        TextView textView = (TextView) customToastroot.findViewById(R.id.texteView1);
        textView.setText(menssagem);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0,0 );
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();


    }
}
