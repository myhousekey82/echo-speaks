library (
        base: "app",
        author: "tonesto7",
        category: "devicesupport",
        description: " Device Support Map",
        name: "devicesupport",
        namespace: "echospeaks20210701",
        documentationLink: ""
)

@Field static final Map deviceSupportMapFLD = [
    types: [
        // Amazon Devices
        "A3C9PE6TNYLTCH" : [ i: "echo_wha", n: "Multiroom" ],

        // Amazon FireTV's
        "A12GXV8XMS007S" : [ c: [ "a", "t" ], i: "firetv_gen1", n: "Fire TV (Gen1)" ],
        "A2E0SNTXJVT7WK" : [ c: [ "a", "t" ], i: "firetv_gen2", n: "Fire TV (Gen2)" ],
        "A2GFL5ZMWNE0PX" : [ c: [ "a", "t" ], i: "firetv_gen3", n: "Fire TV (Gen3)" ],
        "AKPGW064GI9HE"  : [ c: [ "a", "t" ], i: "firetv_stick_gen1", n: "Fire TV Stick 4K (Gen3)" ],
        "AN630UQPG2CA4"  : [ c: [ "a", "t" ], i: "firetv_toshiba", n: "Fire TV (Toshiba)" ],
        "A2JKHJ0PX4J3L3" : [ c: [ "a", "t" ], i: "firetv_cube", n: "Fire TV Cube (Gen2)" ],
        "A265XOI9586NML" : [ c: [ "a", "t" ], i: "firetv_stick_gen1", n: "Fire TV Stick" ],
        "A2LWARUGJLBYEW" : [ c: [ "a", "t" ], i: "firetv_stick_gen1", n: "Fire TV Stick (Gen2)" ],
        "A1F8D55J0FWDTN" : [ c: [ "a", "t" ], i: "toshiba_firetv", n: "Fire TV (Toshiba)" ],
        "AP4RS91ZQ0OOI"  : [ c: [ "a", "t" ], i: "toshiba_firetv", n: "Fire TV (Toshiba)" ],
        "AFF5OAL5E3DIU"  : [ c: [ "a", "t" ], i: "toshiba_firetv", n: "Fire TV" ],
        "A3HF4YRA2L7XGC" : [ c: [ "a", "t" ], i: "firetv_cube", n: "Fire TV Cube" ],
        "AFF50AL5E3DIU"  : [ c: [ "a", "t" ], i: "insignia_firetv",  n: "Fire TV (Insignia)" ],
        "ADVBD696BHNV5"  : [ c: [ "a", "t" ], i: "firetv_stick_gen1", n: "Fire TV Stick (Gen1)" ],
        
        // Amazon Tablets
        "A1Q7QCGNMXAKYW" : [ c: [ "t", "a" ], i: "amazon_tablet", n: "Generic Tablet" ],
        "A1J16TEDOYCZTN" : [ c: [ "a", "t" ], i: "amazon_tablet", n: "Fire Tablet" ],
        "A2M4YX06LWP8WI" : [ c: [ "a", "t" ], i: "amazon_tablet", n: "Fire Tablet" ],
        "A1C66CX2XD756O" : [ c: [ "a", "t" ], i: "amazon_tablet", n: "Fire Tablet HD" ],
        "A3L0T0VL9A921N" : [ c: [ "a", "t" ], i: "tablet_hd10", n: "Fire Tablet HD 8" ],
        "AVU7CPPF2ZRAS"  : [ c: [ "a", "t" ], i: "tablet_hd10", n: "Fire Tablet HD 8" ],
        "A38EHHIB10L47V" : [ c: [ "a", "t" ], i: "tablet_hd10", n: "Fire Tablet HD 8" ],
        "A3R9S4ZZECZ6YL" : [ c: [ "a", "t" ], i: "tablet_hd10", n: "Fire Tablet HD 10" ],

        // Amazon Echo's
        "AB72C64C86AW2"  : [ c: [ "a", "t" ], i: "echo_gen1", n: "Echo (Gen1)" ],
        "A7WXQPH584YP"   : [ c: [ "a", "t" ], i: "echo_gen2", n: "Echo (Gen2)" ],
        "A3FX4UWTP28V1P" : [ c: [ "a", "t" ], i: "echo_gen3", n: "Echo (Gen3)" ],
        "A3RMGO6LYLH7YN" : [ c: [ "a", "t" ], i: "echo_gen4", n: "Echo (Gen4)" ],
        "A2M35JJZWCQOMZ" : [ c: [ "a", "t" ], i: "echo_plus_gen1", n: "Echo Plus (Gen1)" ],
        "A18O6U1UQFJ0XK" : [ c: [ "a", "t" ], i: "echo_plus_gen2", n: "Echo Plus (Gen2)" ],

        // Amazon Echo Dots
        "AKNO1N0KSFN8L"  : [ c: [ "a", "t" ], i: "echo_dot_gen1", n: "Echo Dot (Gen1)" ],
        "A3S5BH2HU6VAYF" : [ c: [ "a", "t" ], i: "echo_dot_gen2", n: "Echo Dot (Gen2)" ],
        "A32DDESGESSHZA" : [ c: [ "a", "t" ], i: "echo_dot_gen3",  n: "Echo Dot (Gen3)" ],
        "A32DOYMUN6DTXA" : [ c: [ "a", "t" ], i: "echo_dot_gen3",  n: "Echo Dot (Gen3)" ],
        "A1RABVCI4QCIKC" : [ c: [ "a", "t" ], i: "echo_dot_gen3", n: "Echo Dot (Gen3)" ],
        "A2U21SRK4QGSE1" : [ c: [ "a", "t" ], i: "echo_dot_gen4",  n: "Echo Dot (Gen4)" ],
        "A30YDR2MK8HMRV" : [ c: [ "a", "t" ], i: "echo_dot_clock", n: "Echo Dot Clock" ],
        "A2H4LV5GIZ1JFT" : [ c: [ "a", "t" ], i: "echo_dot_clock_gen4",  n: "Echo Dot Clock (Gen4)" ],
        
        // Amazon Echo Spot's
        "A10A33FOX2NUBK" : [ c: [ "a", "t" ], i: "echo_spot_gen1", n: "Echo Spot" ],

        // Amazon Echo Show's
        "A1NL4BVLQ4L3N3" : [ c: [ "a", "t" ], i: "echo_show_gen1", n: "Echo Show (Gen1)" ],
        "AWZZ5CVHX2CD"   : [ c: [ "a", "t" ], i: "echo_show_gen2", n: "Echo Show (Gen2)" ],
        "A4ZP7ZC4PI6TO"  : [ c: [ "a", "t" ], i: "echo_show_5", n: "Echo Show 5 (Gen1)" ],
        "A1Z88NGR2BK6A2" : [ c: [ "a", "t" ], i: "echo_show_8", n: "Echo Show 8 (Gen1)" ],
        "AIPK7MM90V7TB"  : [ c: [ "a", "t" ], i: "echo_show_10_gen3", n: "Echo Show 10 (Gen3)" ],
        
        // Amazon Echo Auto's
        "A303PJF6ISQ7IC" : [ c: [ "a", "t" ], i: "echo_auto", n: "Echo Auto" ],
        "A195TXHV1M5D4A" : [ c: [ "a", "t" ], i: "echo_auto", n: "Echo Auto" ],
        "ALT9P69K6LORD"  : [ c: [ "a", "t" ], i: "echo_auto", n: "Echo Auto" ],

        // Other Amazon Devices
        "A38949IHXHRQ5P" : [ c: [ "a", "t" ], i: "echo_tap", n: "Echo Tap" ],
        "A1JJ0KFC4ZPNJ3" : [ c: [ "a", "t" ], i: "echo_input", n: "Echo Input" ],
        "A3IYPH06PH1HRA" : [ c: [ "a", "t" ], i: "echo_frames", n: "Echo Frames" ],
        "A3RBAYBE7VM004" : [ c: [ "a", "t" ], i: "echo_studio", n: "Echo Studio" ],
        "A2RU4B77X9R9NZ" : [ c: [ "a", "t" ], i: "echo_link_amp", n: "Echo Link Amp" ],
        "A3VRME03NAXFUB" : [ c: [ "a", "t" ], i: "echo_flex", n: "Echo Flex" ],
        "A3SSG6GR8UU7SN" : [ c: [ "a", "t" ], i: "echo_sub_gen1", n: "Echo Sub" ],
        "A27VEYGQBW3YR5" : [ c: [ "a", "t" ], i: "echo_link", n: "Echo Link" ],
        
        // Ignored Devices
        "A112LJ20W14H95" : [ ig: true ],
        "A1GC6GEE1XF1G9" : [ ig: true ],
        "A1MPSLFC7L5AFK" : [ ig: true ],
        "A1ORT4KZ23OY88" : [ ig: true ],
        "A1VS6XVTGTLC00" : [ ig: true ],
        "A1VZJGJYCRI78V" : [ ig: true ],
        "A1ZB65LA390I4K" : [ ig: true ],
        "A21X6I4DKINIZU" : [ ig: true ],
        "A21Z3CGI8UIP0F" : [ ig: true ],
        "A2825NDLA7WDZV" : [ ig: true ],
        "A29L394LN0I8HN" : [ ig: true ],
        "A2IVLV5VM2W81"  : [ ig: true ],
        "A2T0P32DY3F7VB" : [ ig: true ],
        "A2TF17PFR55MTB" : [ ig: true ],
        "A2TOXM6L8SFS8A" : [ ig: true ],
        "A2V3E2XUH5Z7M8" : [ ig: true ],
        "A1FWRGKHME4LXH" : [ ig: true ],
        "A26TRKU1GG059T" : [ ig: true ],
        "AU4IFDJDRSBC1"  : [ ig: true ],
        "A2ZOTUOF1IBEYI" : [ ig: true ],
        "ABP0V5EHO8A4U"  : [ ig: true ],
        "AD2YUJTRVBNOF"  : [ ig: true ],
        "ADQRVG6LYK4LQ"  : [ ig: true ],
        "A1GPVMRI4IOS0M" : [ ig: true ],
        "A2Z8O30CD35N8F" : [ ig: true ],
        "A1XN1MKELB7WUF" : [ ig: true ],
        "AINRG27IL8AS0"  : [ ig: true ],
        "A3NVKTZUPX1J3X" : [ ig: true, n: "Onkyp VC30" ],
        "A3NWHXTQ4EBCZS" : [ ig: true ],
        "A2RG3FY1YV97SS" : [ ig: true ],
        "A3H674413M2EKB" : [ ig: true ],
        "AGZWSPR7FLP9E"  : [ ig: true ],
        "AILBSA2LNTOYL"  : [ ig: true ],
        "A2RJLFEH0UEKI9" : [ ig: true ],
        "AKOAGQTKAS9YB"  : [ ig: true ],
        "ATH4K2BAIXVHQ"  : [ ig: true ],
        "A324YMIUSWQDGE" : [ ig: true, i: "unknown", n: "Samsung 8K TV" ],
        "A18X8OBWBCSLD8" : [ ig: true, i: "unknown", n: "Samsung Soundbar" ],
        "A1GA2W150VBSDI" : [ ig: true, i: "unknown", n: "Sony On-Hear Headphones" ],
        "A2S24G29BFP88"  : [ ig: true, i: "unknown", n: "Ford/Lincoln Alexa App" ],
        "A1NAFO69AAQ16Bk": [ ig: true, i: "unknown", n: "Wyze Band" ],
        "A1NAFO69AAQ16B" : [ ig: true, i: "unknown", n: "Wyze Band" ],
        "A3L2K717GERE73" : [ ig: true, i: "unknown", n: "Voice in a Can (iOS)" ],
        "A222D4HGE48EOR" : [ ig: true, i: "unknown", n: "Voice in a Can (Apple Watch)" ],
        "A19JK51Y4N50K5" : [ ig: true, i: "unknown", n: "Jabra(?)" ],

        // Unknown or Needs Image
        "A16MZVIFVHX6P6" : [ c: [ "a", "t" ], i: "unknown", n: "Generic Echo" ],
        "A2XPGY5LRKB9BE" : [ c: [ "a", "t" ], i: "unknown", n: "Fitbit Versa 2" ],
        "A2Y04QPFCANLPQ" : [ c: [ "a", "t" ], i: "unknown", n: "Bose QuietComfort 35 II" ],
        "A3B50IC5QPZPWP" : [ c: [ "a", "t" ], i: "unknown", n: "Polk Command Bar" ],
        "A3CY98NH016S5F" : [ c: [ "a", "t" ], i: "unknown", n: "Facebook Portal Mini" ],
        "AO6HHP9UE6EOF"  : [ c: [ "a", "t" ], i: "unknown", n: "Unknown Media Device" ],
        "A3KULB3NQN7Z1F" : [ c: [ "a", "t" ], i: "unknown", n: "Unknown TV" ],
        "A18TCD9FP10WJ9" : [ c: [ "a", "t" ], i: "unknown", n: "Orbi Voice" ],
        "AGHZIK8D6X7QR"  : [ c: [ "a", "t" ], i: "unknown", n: "Fire TV" ],
        "A1L4KDRIILU6N9" : [ c: [ "a", "t" ], i: "unknown", n: "Sony Speaker" ],
        "A1F1F76XIW4DHQ" : [ c: [ "a", "t" ], i: "unknown", n: "Unknown TV" ],
        "AE7X7Z227NFNS"  : [ c: [ "a", "t" ], i: "unknown", n: "HiMirror Mini" ],
        "AF473ZSOIRKFJ"  : [ c: [ "a", "t" ], i: "unknown", n: "Onkyo VC-PX30" ],
        "A2E5N6DMWCW8MZ" : [ c: [ "a", "t" ], i: "unknown", n: "Brilliant Smart Switch" ],
        "A2C8J6UHV0KFCV" : [ c: [ "a", "t" ], i: "unknown", n: "Alexa Gear" ],
        "AUPUQSVCVHXP0"  : [ c: [ "a", "t" ], i: "unknown", n: "Ecobee Switch+" ],
        "A37M7RU8Z6ZFB"  : [ c: [ "a", "t" ], i: "unknown", n: "Garmin Speak" ],
        "A2WN1FJ2HG09UN" : [ c: [ "a", "t" ], i: "unknown", n: "Ultimate Alexa App" ],
        "A2BRQDVMSZD13S" : [ c: [ "a", "t" ], i: "unknown", n: "SURE Universal Remote" ],
        "A3TCJ8RTT3NVI7" : [ c: [ "a", "t" ], i: "unknown", n: "Alexa Listens" ],
        "A2VAXZ7UNGY4ZH" : [ c: [ "a", "t" ], i: "unknown", n: "Wyze Headphones"],
        "AKO51L5QAQKL2"  : [ c: [ "a", "t" ], i: "unknown", n: "Alexa Jams" ],
        "A3K69RS3EIMXPI" : [ c: [ "a", "t" ], i: "unknown", n: "Hisense Smart TV" ],
        "A1QKZ9D0IJY332" : [ c: [ "a", "t" ], i: "unknown", n: "Samsung TV 2020-U" ],
        "A1SCI5MODUBAT1" : [ c: [ "a", "t"], i: "unknown", n: "Pioneer DMH-W466NEX" ],
        "A1ETW4IXK2PYBP" : [ c: [ "a", "t"], i: "unknown", n: "Talk to Alexa" ],
        "A81PNL0A63P93"  : [ c: [ "a", "t" ], i: "unknown", n: "Home Remote" ],
        
        
        // Blocked Devices
        "A1DL2DVDQVK3Q"  : [ b: true, ig: true, n: "Mobile App" ],
        "A1H0CMF1XM0ZP4" : [ b: true, n: "Bose SoundTouch 30" ],
        "A1X7HJX9QL16M5" : [ b: true, ig: true, n: "Bespoken.io" ],
        "A3SSWQ04XYPXBH" : [ b: true, i: "amazon_tablet", n: "Generic Tablet" ],
        "AKKLQD9FZWWQS"  : [ b: true, c: [ "a", "t" ], i: "unknown", n: "Jabra Elite" ],
        "AP1F6KUH00XPV"  : [ b: true, n: "Stereo/Subwoofer Pair" ],
        "A2WFDCBDEXOXR8" : [ b: true, i: "unknown", n: "Bose Soundbar 700" ],
        "AVN2TMX8MU2YM"  : [ b: true, n: "Bose Home Speaker 500" ],
        "A3F1S88NTZZXS9" : [ b: true, i: "dash_wand", n: "Dash Wand" ],
        "A25EC4GIHFOCSG" : [ b: true, n: "Unrecognized Media Player" ],

        // Other Devices
        "A1W2YILXTG9HA7" : [ c: [ "t", "a" ], i: "unknown", n: "Nextbase 522GW Dashcam" ],
        "A3NPD82ABCPIDP" : [ c: [ "t" ], i: "sonos_beam", n: "Sonos Beam" ],
        "AVD3HM0HOJAAL"  : [ i: "sonos_generic", n: "Sonos" ],
        "AVE5HX13UR5NO"  : [ c: [ "a", "t" ], i: "logitech_zero_touch", n: "Logitech Zero Touch" ],
        "A1M0A9L9HDBID3" : [ c: [ "t" ], i: "one-link", n: "One-Link Safe and Sound" ],
        "A1N9SW0I0LUX5Y" : [ c: [ "a", "t" ], i: "unknown", n: "Ford/Lincoln Alexa App" ],
        "A1P31Q3MOWSHOD" : [ c: [ "t", "a" ], i: "halo_speaker", n: "Zolo Halo Speaker" ],
        "A1RTAM01W29CUP" : [ c: [ "a", "t" ], i: "alexa_windows", n: "Windows App" ],
        "A2LH725P8DQR2A" : [ c: [ "a", "t" ], i: "fabriq_riff", n: "Fabriq Riff" ],
        "A15ERDAKK5HQQG" : [ i: "sonos_generic", n: "Sonos" ],
        "A10L5JEZTKKCZ8" : [ c: [ "a", "t" ], i: "vobot_bunny", n: "Vobot Bunny" ],
        "A17LGWINFBUTZZ" : [ c: [ "t", "a" ], i: "roav_viva", n: "Anker Roav Viva" ],
        "A18BI6KPKDOEI4" : [ c: [ "a", "t" ], i: "ecobee4", n: "Ecobee4" ],
        "A2R2GLZH1DFYQO" : [ c: [ "t", "a" ], i: "halo_speaker", n: "Zolo Halo Speaker" ],
        "A2J0R2SD7G9LPA" : [ c: [ "a", "t" ], i: "lenovo_smarttab_m10", n: "Lenovo SmartTab M10" ],
        "A2OSP3UA4VC85F" : [ i: "sonos_generic", n: "Sonos" ],
        "A2X8WT9JELC577" : [ c: [ "a", "t" ], i: "ecobee4", n: "Ecobee5" ],
        "A347G2JC8I4HC7" : [ c: [ "a", "t" ], i: "unknown", n: "Roav Car Charger Pro" ],        
        "A37CFAHI1O0CXT" : [ i: "logitech_blast", n: "Logitech Blast" ],
        "A37SHHQ3NUL7B5" : [ b: true, n: "Bose Home Speaker 500" ],
        "A38BPK7OW001EX" : [ b: true, n: "Raspberry Alexa" ],
        "A3B5K1G3EITBIF" : [ c: [ "a", "t" ], i: "facebook_portal", n: "Facebook Portal" ],
        "A3D4YURNTARP5K" : [ c: [ "a", "t" ], i: "facebook_portal", n: "Facebook Portal TV" ],
        "A3QPPX1R9W5RJV" : [ c: [ "a", "t" ], i: "fabriq_chorus", n: "Fabriq Chorus" ],
        "A3BW5ZVFHRCQPO" : [ c: [ "a", "t" ], i: "unknown", n: "BMW Alexa Integration" ],
        "A3BRT6REMPQWA8" : [ c: [ "a", "t" ], i: "sonos_generic", n: "Bose Home Speaker 450" ],
        "A2HZENIFNYTXZD" : [ c: [ "a", "t" ], i: "facebook_portal", n: "Facebook Portal" ],
        "A52ARKF0HM2T4"  : [ c: [ "a", "t" ], i: "facebook_portal", n: "Facebook Portal+" ],
        
    ],
    families: [
        block: [ "AMAZONMOBILEMUSIC_ANDROID", "AMAZONMOBILEMUSIC_IOS", "TBIRD_IOS", "TBIRD_ANDROID", "VOX", "MSHOP" ],
        echo: [ "ROOK", "KNIGHT", "ECHO" ],
        other: [ "REAVER", "FIRE_TV", "FIRE_TV_CUBE", "ALEXA_AUTO", "MMSDK" ],
        tablet: [ "TABLET" ],
        wha: [ "WHA" ]
    ]
]