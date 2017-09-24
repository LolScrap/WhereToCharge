package lt.seaportdevelopers.dp.dviratininkopagalbininkas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapsFragment extends Fragment implements OnMapReadyCallback {

    private final static int MY_PERMISSION_FINE_LOCATION = 101;

    GoogleMap map;

    public GoogleMapsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_google_maps, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        if (map != null) {
            map.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter(){

                @Override
                public View getInfoWindow(Marker marker) {
                    return null;
                }

                @Override
                public View getInfoContents(Marker marker) {
                    View v = getActivity().getLayoutInflater().inflate(R.layout.infowindow_layout, null);
                    TextView storeTitle = (TextView) v.findViewById(R.id.store_title);
                    TextView storeSnippet = (TextView) v.findViewById(R.id.store_snippet);
                    storeTitle.setText(marker.getTitle());
                    //storeSnippet.setText(marker.getSnippet());
                    return v;
                }
            });
        }

        map.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(GoogleMapsFragment.this.getActivity(), DetailedInformation.class);
                intent.putExtra("title", marker.getTitle());
                intent.putExtra("snippet", marker.getSnippet());
                startActivity(intent);
            }
        });

        // MARKERIAI

        LatLng cd1 = new LatLng(54.688514, 25.277498);
        map.addMarker(new MarkerOptions().position(cd1)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd1));

        LatLng cd2 = new LatLng(55.927940, 23.308389);
        map.addMarker(new MarkerOptions().position(cd2)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd2));

        LatLng cd3 = new LatLng(54.898296, 23.906289);
        map.addMarker(new MarkerOptions().position(cd3)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd3));

        LatLng cd4 = new LatLng(55.272471, 24.015883);
        map.addMarker(new MarkerOptions().position(cd4)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd4));

        LatLng cd5 = new LatLng(55.687716, 21.159028);
        map.addMarker(new MarkerOptions().position(cd5)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd5));

        LatLng cd6 = new LatLng(54.688658, 25.278350);
        map.addMarker(new MarkerOptions().position(cd6)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd6));

        LatLng cd7 = new LatLng(54.117890, 24.105900);
        map.addMarker(new MarkerOptions().position(cd7)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd7));

        LatLng cd8 = new LatLng(54.937207, 23.890139);
        map.addMarker(new MarkerOptions().position(cd8)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd8));

        LatLng cd9 = new LatLng(54.741741, 25.222750);
        map.addMarker(new MarkerOptions().position(cd9)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd9));

        LatLng cd10 = new LatLng(55.744639, 24.334861);
        map.addMarker(new MarkerOptions().position(cd10)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd10));

        LatLng cd11 = new LatLng(54.696047, 25.273716);
        map.addMarker(new MarkerOptions().position(cd11)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd11));

        LatLng cd12 = new LatLng(54.904068, 23.957739);
        map.addMarker(new MarkerOptions().position(cd12)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd12));

        LatLng cd13 = new LatLng(54.941793, 24.007090);
        map.addMarker(new MarkerOptions().position(cd13)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd13));

        LatLng cd14 = new LatLng(55.303372, 21.006278);
        map.addMarker(new MarkerOptions().position(cd14)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd14));

        LatLng cd15 = new LatLng(55.468041, 22.689060);
        map.addMarker(new MarkerOptions().position(cd15)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd15));

        LatLng cd16 = new LatLng(54.710247, 25.261923);
        map.addMarker(new MarkerOptions().position(cd16)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd16));

        LatLng cd17 = new LatLng(54.773337, 24.816434);
        map.addMarker(new MarkerOptions().position(cd17)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd17));

        LatLng cd18 = new LatLng(54.919398, 23.949395);
        map.addMarker(new MarkerOptions().position(cd18)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd18));

        LatLng cd19 = new LatLng(54.738059, 25.230940);
        map.addMarker(new MarkerOptions().position(cd19)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd19));

        LatLng cd20 = new LatLng(54.943640, 23.893114);
        map.addMarker(new MarkerOptions().position(cd20)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd20));

        LatLng cd21 = new LatLng(55.687016, 21.155972);
        map.addMarker(new MarkerOptions().position(cd21)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd21));

        LatLng cd22 = new LatLng(55.729531, 21.123677);
        map.addMarker(new MarkerOptions().position(cd22)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd22));

        LatLng cd23 = new LatLng(55.731038, 24.313021);
        map.addMarker(new MarkerOptions().position(cd23)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd23));

        LatLng cd24 = new LatLng(55.733565, 24.360746);
        map.addMarker(new MarkerOptions().position(cd24)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd24));

        LatLng cd25 = new LatLng(54.668636, 25.235034);
        map.addMarker(new MarkerOptions().position(cd25)
                .title("Charging station")
                .snippet("Electric car charging station \n\n +370 000 00000 \n\n http://website \n\n Working hours: \n Always open")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        map.moveCamera(CameraUpdateFactory.newLatLng(cd25));

        if (ActivityCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            map.setMyLocationEnabled(true);
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_FINE_LOCATION);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSION_FINE_LOCATION:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.checkSelfPermission(getActivity().getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        map.setMyLocationEnabled(true);
                    }
                }
                break;
        }
    }
}