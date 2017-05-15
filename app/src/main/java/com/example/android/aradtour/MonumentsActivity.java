package com.example.android.aradtour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.locations_list);

        // Creates a list of locations
        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.monuments_name_palaceOfCulture, R.string.monuments_address_palaceOfCulture , R.drawable.palace_of_culture));
        locations.add(new Location(R.string.monuments_name_administrativePalace, R.string.monuments_address_administrativePalace, R.drawable.administrative_palace));
        locations.add(new Location(R.string.monuments_name_publicFinances, R.string.monuments_address_publicFinances, R.drawable.public_finances));
        locations.add(new Location(R.string.monuments_name_formerPrefecture, R.string.monuments_address_formerPrefecture, R.drawable.former_prefecture));
        locations.add(new Location(R.string.monuments_name_ioanSlaviciTheatre, R.string.monuments_address_ioanSlaviciTheatre, R.drawable.ioan_slavici_theatre));
        locations.add(new Location(R.string.monuments_name_moiseNicoaraCollege, R.string.monuments_address_moiseNicoaraCollege, R.drawable.moise_nicoara_college));
        locations.add(new Location(R.string.monuments_name_neumannPalace, R.string.monuments_address_neumannPalace, R.drawable.neumann_palace));
        locations.add(new Location(R.string.monuments_name_andrenyiPalace, R.string.monuments_address_andrenyiPalace, R.drawable.andrenyi_palace));
        locations.add(new Location(R.string.monuments_name_cenadPalace, R.string.monuments_address_cenadPalace, R.drawable.cenad_palace));
        locations.add(new Location(R.string.monuments_name_evangelicalLutheranChurch, R.string.monuments_address_evangelicalLutheranChurch, R.drawable.evangelical_lutheran_church));
        locations.add(new Location(R.string.monuments_name_romanCatholicChurch, R.string.monuments_address_romanCatholicChurch, R.drawable.roman_catholic_cathedral));
        locations.add(new Location(R.string.monuments_name_szantayPalace, R.string.monuments_address_szantayPalace, R.drawable.szantay_palace));
        locations.add(new Location(R.string.monuments_name_nationalBank, R.string.monuments_address_nationalBank, R.drawable.national_bank));
        locations.add(new Location(R.string.monuments_name_bohusPalace, R.string.monuments_address_bohusPalace, R.drawable.bohus_palace));
        locations.add(new Location(R.string.monuments_name_hermannGyulaPalace, R.string.monuments_address_hermannGyulaPalace, R.drawable.herman_palace));
        locations.add(new Location(R.string.monuments_name_victoriaBank, R.string.monuments_address_victoriaBank, R.drawable.victoria_bank));
        locations.add(new Location(R.string.monuments_name_martyrGenerals, R.string.monuments_address_martyrGenerals, R.drawable.martyr_generals_monument));
        locations.add(new Location(R.string.monuments_name_oldCasino, R.string.monuments_address_oldCasino, R.drawable.old_casino));
        locations.add(new Location(R.string.monuments_name_justicePalace, R.string.monuments_address_justicePalace, R.drawable.justice_palace));
        locations.add(new Location(R.string.monuments_name_neologistSynagogue, R.string.monuments_address_neologistSynagogue, R.drawable.neologist_synagogue));
        locations.add(new Location(R.string.monuments_name_normalGirlsSchool, R.string.monuments_address_normalGirlsSchool, R.drawable.normal_school_for_girls));
        locations.add(new Location(R.string.monuments_name_romanianPreparandia, R.string.monuments_address_romanianPreparandia, R.drawable.romanian_preparandia));
        locations.add(new Location(R.string.monuments_name_ensembleOfAradFortress, R.string.monuments_address_ensembleOfAradFortress, R.drawable.ensemble_of_arad_fortress));
        locations.add(new Location(R.string.monuments_name_stJohnOrthodoxCathedral, R.string.monuments_address_stJohnOrthodoxCathedral, R.drawable.st_jhon_orthodox_cathedral));
        locations.add(new Location(R.string.monuments_name_serbianChurch, R.string.monuments_address_serbianChurch, R.drawable.serbian_church));
        locations.add(new Location(R.string.monuments_name_trajanBridge, R.string.monuments_address_trajanBridge, R.drawable.trajan_bridge));

        LocationAdapter adapter = new LocationAdapter(this, locations);
        ListView listView = (ListView) findViewById(R.id.locations_list);
        listView.setAdapter(adapter);
    }
}
