package com.example.tehtava6_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context c;
    String[] names = {"Stahlberg, Kaarlo Juho","Relander, Lauri Kristian","Svinhufvud, Pehr, Evind","Kallio, Kyosti",
            "Ryti, Risto Heikki","Mannerheim, Carl Gustav Emil","Paasikivi, Juho Kusti","Kekkonen, Urho Kaleva","Koivisto, Mauno Henrik",
            "Ahtisaari, Martti Oiva Kalevi","Halonen, Tarja Kaarina","Niinistö, Sauli Väinämö"};
    String[] stratYear = {"1919","1925","1931","1937","1940","1944","1946","1956","1982","1994","2000","2012"};
    String[] endYear = {"1925", "1931", "1937", "1940", "1944", "1946", "1956", "1982", "1994", "2000", "2012", "2024"};
    String[] description = {"Eka presidentti", "Reissulasse", "Kolmas presidentti", "Neljas presidentti", "Viides presidentti",
            "Kuudes presidentti", "Äkäinen ukko", "Pelimies", "Manu", "Mahtisaari", "Eka naispressa", "Owner of Lennu, the First Dog" };

    public CustomAdapter(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item,null);
        }
        //get view
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);

        //set data
        tvName.setText(names[position]);

        return  convertView;
    }
}
