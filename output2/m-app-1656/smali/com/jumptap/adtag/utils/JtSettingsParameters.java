public class com.jumptap.adtag.utils.JtSettingsParameters {
	 /* .source "JtSettingsParameters.java" */
	 /* # static fields */
	 private static final java.lang.String ADULT_CONTENT_TYPE;
	 private static final java.lang.String AGE;
	 private static final java.lang.String ALTERNATE_IMAGE;
	 private static final java.lang.String APP_ID;
	 private static final java.lang.String APP_VER;
	 private static final java.lang.String BACKGROUND_COLOR;
	 private static final java.lang.String COUNTRY;
	 private static final java.lang.String DISMIIS_BUTTON_LABEL;
	 private static final java.lang.String GENDER;
	 private static final java.lang.String HHI;
	 private static final java.lang.String HOST;
	 private static final java.lang.String INTERDTITIAL_TIME;
	 private static final java.lang.String LANGUAGE;
	 private static final java.lang.String POSTAL_CODE;
	 private static final java.lang.String PUBLISHER_ID;
	 private static final java.lang.String REFRESH_PERIOD;
	 private static final java.lang.String SITE_ID;
	 private static final java.lang.String SPOT_ID;
	 /* # direct methods */
	 public com.jumptap.adtag.utils.JtSettingsParameters ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer getIntValueFromAttributes ( android.util.AttributeSet p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .param p0, "attributes" # Landroid/util/AttributeSet; */
		 /* .param p1, "ns" # Ljava/lang/String; */
		 /* .param p2, "attrName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 65 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 66 */
		 /* .local v0, "paramValue":I */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 67 */
			 v0 = 			 int v1 = -1; // const/4 v1, -0x1
			 /* .line 69 */
		 } // :cond_0
	 } // .end method
	 public static java.lang.String getStringValueFromAttributes ( android.util.AttributeSet p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .param p0, "attributes" # Landroid/util/AttributeSet; */
		 /* .param p1, "ns" # Ljava/lang/String; */
		 /* .param p2, "attrName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 44 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 45 */
			 /* .line 47 */
			 /* .local v0, "paramValue":Ljava/lang/String; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 final String v1 = ""; // const-string v1, ""
				 v1 = 				 (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
				 /* if-nez v1, :cond_0 */
				 v1 = 				 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
				 /* if-lez v1, :cond_0 */
				 /* .line 51 */
			 } // .end local v0 # "paramValue":Ljava/lang/String;
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer getUnsignedIntValueFromAttributes ( android.util.AttributeSet p0, java.lang.String p1, java.lang.String p2 ) {
	 /* .locals 2 */
	 /* .param p0, "attributes" # Landroid/util/AttributeSet; */
	 /* .param p1, "ns" # Ljava/lang/String; */
	 /* .param p2, "attrName" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 56 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 57 */
	 /* .local v0, "paramValue":I */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 58 */
		 v0 = 		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 60 */
	 } // :cond_0
} // .end method
public static void populateSettings ( com.jumptap.adtag.JtAdWidgetSettings p0, android.util.AttributeSet p1, android.content.Context p2 ) {
	 /* .locals 5 */
	 /* .param p0, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
	 /* .param p1, "attributes" # Landroid/util/AttributeSet; */
	 /* .param p2, "context" # Landroid/content/Context; */
	 /* .prologue */
	 int v4 = -1; // const/4 v4, -0x1
	 /* .line 73 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 74 */
	 /* .local v1, "paramValue":Ljava/lang/String; */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 75 */
	 /* .local v0, "intValue":I */
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "publisherId"; // const-string v3, "publisherId"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 76 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setPublisherId ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setPublisherId(Ljava/lang/String;)V
		 /* .line 78 */
	 } // :cond_0
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "siteId"; // const-string v3, "siteId"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 79 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setSiteId ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setSiteId(Ljava/lang/String;)V
		 /* .line 81 */
	 } // :cond_1
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "spotId"; // const-string v3, "spotId"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 82 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setSpotId ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setSpotId(Ljava/lang/String;)V
		 /* .line 84 */
	 } // :cond_2
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "host"; // const-string v3, "host"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* .line 85 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setHostURL ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setHostURL(Ljava/lang/String;)V
		 /* .line 87 */
	 } // :cond_3
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "language"; // const-string v3, "language"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_4
		 /* .line 88 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setLanguage ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setLanguage(Ljava/lang/String;)V
		 /* .line 90 */
	 } // :cond_4
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "adultContentType"; // const-string v3, "adultContentType"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_5
		 /* .line 91 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setAdultContentType ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setAdultContentType(Ljava/lang/String;)V
		 /* .line 93 */
	 } // :cond_5
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "postalCode"; // const-string v3, "postalCode"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_6
		 /* .line 94 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setPostalCode ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setPostalCode(Ljava/lang/String;)V
		 /* .line 96 */
	 } // :cond_6
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "country"; // const-string v3, "country"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_7
		 /* .line 97 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setCountry ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setCountry(Ljava/lang/String;)V
		 /* .line 99 */
	 } // :cond_7
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "age"; // const-string v3, "age"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_8
		 /* .line 100 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setAge ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setAge(Ljava/lang/String;)V
		 /* .line 102 */
	 } // :cond_8
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "gender"; // const-string v3, "gender"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_9
		 /* .line 103 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setGender ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setGender(Ljava/lang/String;)V
		 /* .line 105 */
	 } // :cond_9
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "hhi"; // const-string v3, "hhi"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_a
		 /* .line 106 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setHHI ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setHHI(Ljava/lang/String;)V
		 /* .line 108 */
	 } // :cond_a
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "alternateImage"; // const-string v3, "alternateImage"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_b
		 /* .line 109 */
		 com.jumptap.adtag.utils.JtSettingsParameters .setAlternativeImage ( v1,p0,p2 );
		 /* .line 111 */
	 } // :cond_b
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "dismissLabel"; // const-string v3, "dismissLabel"
	 com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
	 if ( v1 != null) { // if-eqz v1, :cond_c
		 /* .line 112 */
		 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setDismissButtonLabel ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setDismissButtonLabel(Ljava/lang/String;)V
		 /* .line 114 */
	 } // :cond_c
	 final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
	 final String v3 = "alternateColor"; // const-string v3, "alternateColor"
	 v0 = 	 com.jumptap.adtag.utils.JtSettingsParameters .getUnsignedIntValueFromAttributes ( p1,v2,v3 );
	 /* if-eq v0, v4, :cond_d */
	 /* .line 115 */
	 (( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setBackgroundColor(I)V
	 /* .line 117 */
} // :cond_d
final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
final String v3 = "refreshPeriodInSec"; // const-string v3, "refreshPeriodInSec"
v0 = com.jumptap.adtag.utils.JtSettingsParameters .getIntValueFromAttributes ( p1,v2,v3 );
/* if-eq v0, v4, :cond_e */
/* .line 118 */
(( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setRefreshPeriod ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setRefreshPeriod(I)V
/* .line 120 */
} // :cond_e
final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
final String v3 = "interstitialTime"; // const-string v3, "interstitialTime"
v0 = com.jumptap.adtag.utils.JtSettingsParameters .getIntValueFromAttributes ( p1,v2,v3 );
/* if-eq v0, v4, :cond_f */
/* .line 121 */
(( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setInterstitialshowTime ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setInterstitialshowTime(I)V
/* .line 123 */
} // :cond_f
final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
final String v3 = "applicationId"; // const-string v3, "applicationId"
com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
if ( v1 != null) { // if-eqz v1, :cond_10
/* .line 124 */
(( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setApplicationId ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationId(Ljava/lang/String;)V
/* .line 126 */
} // :cond_10
final String v2 = "http://www.jumptap.com/lib/android"; // const-string v2, "http://www.jumptap.com/lib/android"
final String v3 = "applicationVersion"; // const-string v3, "applicationVersion"
com.jumptap.adtag.utils.JtSettingsParameters .getStringValueFromAttributes ( p1,v2,v3 );
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 127 */
(( com.jumptap.adtag.JtAdWidgetSettings ) p0 ).setApplicationVersion ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setApplicationVersion(Ljava/lang/String;)V
/* .line 129 */
} // :cond_11
return;
} // .end method
private static void setAlternativeImage ( java.lang.String p0, com.jumptap.adtag.JtAdWidgetSettings p1, android.content.Context p2 ) {
/* .locals 9 */
/* .param p0, "paramValue" # Ljava/lang/String; */
/* .param p1, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 133 */
(( android.content.Context ) p2 ).getResources ( ); // invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 135 */
/* .local v5, "res":Landroid/content/res/Resources; */
(( android.content.Context ) p2 ).getPackageName ( ); // invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 136 */
/* .local v1, "defaultPackage":Ljava/lang/String; */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Here is the parameter: "; // const-string v8, "Here is the parameter: "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p0 ); // invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = " defaultPackage: "; // const-string v8, " defaultPackage: "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v1 ); // invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v6,v7 );
/* .line 138 */
int v6 = 0; // const/4 v6, 0x0
v4 = (( android.content.res.Resources ) v5 ).getIdentifier ( p0, v6, v1 ); // invoke-virtual {v5, p0, v6, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 139 */
/* .local v4, "imageID":I */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 141 */
try { // :try_start_0
(( android.content.res.Resources ) v5 ).getDrawable ( v4 ); // invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* check-cast v2, Landroid/graphics/drawable/BitmapDrawable; */
/* .line 142 */
/* .local v2, "drawable":Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) v2 ).getBitmap ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
/* .line 143 */
/* .local v0, "bm":Landroid/graphics/Bitmap; */
(( com.jumptap.adtag.JtAdWidgetSettings ) p1 ).setAlternateImage ( v0 ); // invoke-virtual {p1, v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->setAlternateImage(Landroid/graphics/Bitmap;)V
/* :try_end_0 */
/* .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 152 */
} // .end local v0 # "bm":Landroid/graphics/Bitmap;
} // .end local v2 # "drawable":Landroid/graphics/drawable/BitmapDrawable;
} // :goto_0
return;
/* .line 144 */
/* :catch_0 */
/* move-exception v3 */
/* .line 145 */
/* .local v3, "e":Landroid/content/res/Resources$NotFoundException; */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Cannot found Resource:"; // const-string v8, "Cannot found Resource:"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p0 ); // invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = ".Going to load system alternative image"; // const-string v8, ".Going to load system alternative image"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* .line 146 */
final String v6 = "JtAd"; // const-string v6, "JtAd"
(( android.content.res.Resources$NotFoundException ) v3 ).getMessage ( ); // invoke-virtual {v3}, Landroid/content/res/Resources$NotFoundException;->getMessage()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* .line 150 */
} // .end local v3 # "e":Landroid/content/res/Resources$NotFoundException;
} // :cond_0
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Cannot found Resource:"; // const-string v8, "Cannot found Resource:"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p0 ); // invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
} // .end method
