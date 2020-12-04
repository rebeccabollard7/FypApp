package is4401.bis.ucc.gymapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_nearby, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);  //use SuppoprtMapFragment for using in fragment instead of activity  MapFragment = activity   SupportMapFragment = fragment
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

                mMap.clear(); //clear old markers


                //position map
                CameraPosition googlePlex = CameraPosition.builder()
                        .target(new LatLng(51.8774785,-8.436061))
                        .zoom(10)
                        .bearing(0)
                        .tilt(45)
                        .build();

                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 10000, null);

                //add markers to the map
                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87459182739258, -8.475560188293457))
                        .title("Women's Fitness Plus")
                        .snippet("South Ring Business Park, Kinsale Rd, Ballyphehane, Cork"));


                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87814, -8.43728))
                        .title("Dennehy's Health and Fitness Douglas")
                        .snippet("Unit 1 & 2, Level 3 & 4 Douglas Village Shopping Centre, Co. Cork, T12 A797"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87013308871297, -8.474998295715826))
                        .title("Motivated Fitness (HAMMER STRENGTH) Gym")
                   .snippet("Unit 9, Metro Business Park, Cork, T12 Y654"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87638616015369, -8.478517354428588))
                        .title("Fitnessworx Gym")
                        .snippet("Unit 11, Nyhan Industrial Estate, Unit 13 Nyhan Industrial Estate Tramore Road Togher Cork Co Cork IE T12XY18"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87013308871297, -8.474998295715826))
                        .title("Maradyke Arena UCC")
                        .snippet("Mardyke Walk, Western Rd, Cork, T12 N1FK"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.919907065446345, -8.464598113225593))
                        .title("Dennehy's Health & Fitness Blackpool")
                        .snippet("Blackpool Retail Park, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.8894049155473, -8.530001096573784))
                        .title("LeisureWorld Bishopstown")
                        .snippet("Rossa Ave, Bishopstown, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.9019048288939, -8.443140440866602))
                        .title("Studio Fitness Cork")
                        .snippet("Unit G9, Marina Commercial Park, Centre Park Rd, Ballintemple, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87743139969988, -8.451466017375884))
                        .title("Resolution Fitness")
                        .snippet("Mount Vernon Cres, Ballinlough, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.8850609110816, -8.47137873678264))
                        .title("Bull And Fiddle Fitness Centre")
                        .snippet("60-62 Tory Top Rd, Ballyphehane, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.886915110452335, -8.398336821491462))
                        .title("Gym Plus Cork")
                        .snippet("2 Park Place City Gate, Mahon, Cork, T12 DH0F"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87345718280392, -8.509058409102408))
                        .title("My Bodyworks")
                        .snippet("1A, Doughcloyne Industrial Estate, Sarsfield Rd, Garranedarragh, Wilton, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.870807509895144, -8.49034731906002))
                        .title("DT Fitness and Performance")
                        .snippet("Lehenaghmore Industrial Estate, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.868261380477385, -8.477316439008115))
                        .title("The Squad")
                        .snippet("Richfield Business Park, Unit 4, The Squad, Ballycurreen, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.901214069506615, -8.484869538760083))
                        .title("NRG Health & Fitness")
                        .snippet("The River Lee Hotel, Western Road, The Lough, Cork, T12 X2AH"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.89891072645942, -8.465056544134773))
                        .title("Club Vitae Health & Fitness Club - Cork (Clayton Hotel)")
                        .snippet("Clayton Hotel, Lapp's Quay, Centre, Cork, T12 RD6E"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.89997622692477, -8.448555621228769))
                        .title("Elite Fitness Centre Cork")
                        .snippet("Marina Commercial Park, G2 Centre Park Rd, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.923722795591715, -8.480699213547002))
                        .title("Planet Health Club")
                        .snippet("Old Mallow Rd, Cork, T23 NR4R"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.89089255883134, -8.573568016987133))
                        .title("Dennehy's Health & Fitness")
                        .snippet("Westpoint Business Park, Link Rd, Carrigrohane, Ballincollig, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.89867867248324, -8.468682917353297))
                        .title("FLYEfit Cork")
                        .snippet("FLYEfit, 10 Oliver Plunkett St, Centre, Cork, T12 YT78"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.8949751270292, -8.467771411104057))
                        .title("One life Fitness South Terrace")
                        .snippet("12-13 South Terrace, Ballintemple, Cork, T12 T0CT"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.811918010217425, -8.383071842286995))
                        .title("Catalyst Health and Fitness Ltd")
                        .snippet("Carrigaline Rd, Kilnaglery, Carrigaline, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.93277774746701, -8.369916752072157))
                        .title("Educogym Glanmire")
                        .snippet("Brooklodge Business Park, Cork, T45 YX80"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.934080511119745, -8.563287417148718))
                        .title("Fitness Underground")
                        .snippet("Shamrock House, 17C, Shamrock Terrace, Blarney, Co. Cork, T23 TY7Y"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.70700420695075, -8.523119817157642))
                        .title("Rogue Fitness")
                        .snippet("Farm Ln, Knocknabohilly, Kinsale, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.88938851269829, -8.585787379058544))
                        .title("Anytime Fitness Ballincollig")
                        .snippet("East Gate, Old Fort Rd, Ballincollig, Co. Cork, P31 N266"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.74584554966206, -8.722620486469047))
                        .title("Bfit Health and Fitness")
                        .snippet("7, Bandon Retail Park, The Bypass, Clogheenavodig, Bandon, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.87960995673783, -8.424502880910115))
                        .title("Rochestown Park Hotel Health & Leisure Club")
                        .snippet("Rochestown Rd, Douglas, Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.9720968593917, -7.861811939112105))
                        .title("Be Active Gym & Fitness Studios")
                        .snippet("Unit 5A, Marl Hill, Foxhole Industrial Estate, Youghal, Co. Cork"));

                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(51.89503215441418, -8.479046063714755))
                        .title("ACLAÍ")
                        .snippet("Unit 9, Crawford Business Park, Bishop St, The Lough, Cork, T12 PR89"));











            }
        });


        return rootView;
    }

    private BitmapDescriptor bitmapDescriptorFromVector(Context context, int vectorResId) {
        Drawable vectorDrawable = ContextCompat.getDrawable(context, vectorResId);
        vectorDrawable.setBounds(0, 0, vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

}