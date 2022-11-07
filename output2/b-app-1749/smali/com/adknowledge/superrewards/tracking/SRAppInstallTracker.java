public class com.adknowledge.superrewards.tracking.SRAppInstallTracker {
	 /* .source "SRAppInstallTracker.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$1;, */
	 /* Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask; */
	 /* } */
} // .end annotation
/* # static fields */
public static java.lang.String h;
private static com.adknowledge.superrewards.tracking.SRAppInstallTracker instance;
public static java.util.HashMap map;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
java.lang.String androidID;
java.lang.String countryCode;
android.content.Context ctx;
java.lang.String deviceBuildModel;
java.lang.String deviceID;
java.lang.String deviceOSBuildVersion;
java.lang.String hparam;
java.lang.Boolean isSet;
java.lang.String qs;
java.lang.String simSerial;
Boolean toast;
/* # direct methods */
static com.adknowledge.superrewards.tracking.SRAppInstallTracker ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 34 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
protected com.adknowledge.superrewards.tracking.SRAppInstallTracker ( ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "h" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 50 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 31 */
java.lang.Boolean .valueOf ( v2 );
this.isSet = v1;
/* .line 36 */
/* iput-boolean v2, p0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->toast:Z */
/* .line 51 */
this.ctx = p1;
/* .line 52 */
this.hparam = p2;
/* .line 53 */
v1 = this.ctx;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 54 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
this.deviceID = v1;
/* .line 55 */
(( android.telephony.TelephonyManager ) v0 ).getSimSerialNumber ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
this.simSerial = v1;
/* .line 56 */
v1 = android.os.Build.MODEL;
this.deviceBuildModel = v1;
/* .line 57 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = ""; // const-string v2, ""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.ctx;
(( android.content.Context ) v2 ).getContentResolver ( ); // invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v3 = "android_id"; // const-string v3, "android_id"
android.provider.Settings$Secure .getString ( v2,v3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.androidID = v1;
/* .line 58 */
v1 = android.os.Build$VERSION.RELEASE;
this.deviceOSBuildVersion = v1;
/* .line 59 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).getCountry ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
this.countryCode = v1;
/* .line 60 */
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).getDeviceParams ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->getDeviceParams()Ljava/util/HashMap;
/* .line 61 */
v1 = this.hparam;
com.adknowledge.superrewards.tracking.SRAppInstallTracker .setHparam ( v1 );
/* .line 62 */
int v1 = 1; // const/4 v1, 0x1
java.lang.Boolean .valueOf ( v1 );
this.isSet = v1;
/* .line 63 */
return;
} // .end method
public static com.adknowledge.superrewards.tracking.SRAppInstallTracker getInstance ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "h" # Ljava/lang/String; */
/* .prologue */
/* .line 39 */
v0 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.instance;
/* if-nez v0, :cond_0 */
/* .line 40 */
/* new-instance v0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
/* invoke-direct {v0, p0, p1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
/* .line 42 */
} // :cond_0
v0 = com.adknowledge.superrewards.tracking.SRAppInstallTracker.instance;
} // .end method
public static java.lang.Void setHparam ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "h" # Ljava/lang/String; */
/* .prologue */
/* .line 66 */
/* .line 67 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public java.util.HashMap getDeviceParams ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 139 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 140 */
/* .local v0, "SRMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;" */
final String v1 = "type"; // const-string v1, "type"
final String v2 = "android"; // const-string v2, "android"
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 141 */
final String v1 = "device_id"; // const-string v1, "device_id"
v2 = this.deviceID;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 142 */
final String v1 = "alt_id"; // const-string v1, "alt_id"
v2 = this.androidID;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 143 */
final String v1 = "model"; // const-string v1, "model"
v2 = this.deviceBuildModel;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 144 */
final String v1 = "os"; // const-string v1, "os"
final String v2 = "Android"; // const-string v2, "Android"
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 145 */
final String v1 = "os_version"; // const-string v1, "os_version"
v2 = this.deviceOSBuildVersion;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 146 */
final String v1 = "cc"; // const-string v1, "cc"
v2 = this.countryCode;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 147 */
final String v1 = "ip"; // const-string v1, "ip"
com.adknowledge.superrewards.Utils .getLocalIpAddress ( );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 148 */
final String v1 = "h"; // const-string v1, "h"
v2 = this.hparam;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 149 */
final String v1 = "sim_serial"; // const-string v1, "sim_serial"
v2 = this.simSerial;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 150 */
final String v1 = "version"; // const-string v1, "version"
v2 = com.adknowledge.superrewards.model.SRParams.version_number;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 151 */
} // .end method
public Boolean getShowToast ( ) {
/* .locals 1 */
/* .prologue */
/* .line 83 */
/* iget-boolean v0, p0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->toast:Z */
} // .end method
public Boolean hasRunBefore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 75 */
v0 = this.ctx;
v0 = com.adknowledge.superrewards.Utils .checkRunFlag ( v0 );
} // .end method
public void set ( ) {
/* .locals 3 */
/* .prologue */
/* .line 127 */
v1 = this.ctx;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 128 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
this.deviceID = v1;
/* .line 129 */
(( android.telephony.TelephonyManager ) v0 ).getSimSerialNumber ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
this.simSerial = v1;
/* .line 130 */
v1 = android.os.Build.MODEL;
this.deviceBuildModel = v1;
/* .line 131 */
v1 = this.ctx;
(( android.content.Context ) v1 ).getContentResolver ( ); // invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v2 = "android_id"; // const-string v2, "android_id"
android.provider.Settings$Secure .getString ( v1,v2 );
this.androidID = v1;
/* .line 132 */
v1 = android.os.Build$VERSION.RELEASE;
this.deviceOSBuildVersion = v1;
/* .line 133 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v1 ).getCountry ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
this.countryCode = v1;
/* .line 134 */
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).getDeviceParams ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->getDeviceParams()Ljava/util/HashMap;
/* .line 135 */
int v1 = 1; // const/4 v1, 0x1
java.lang.Boolean .valueOf ( v1 );
this.isSet = v1;
/* .line 136 */
return;
} // .end method
public void setShowToast ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "show" # Z */
/* .prologue */
/* .line 79 */
/* iput-boolean p1, p0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->toast:Z */
/* .line 80 */
return;
} // .end method
public void track ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 98 */
v0 = (( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).hasRunBefore ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->hasRunBefore()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 101 */
} // :goto_0
return;
/* .line 99 */
} // :cond_0
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).setShowToast ( v2 ); // invoke-virtual {p0, v2}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->setShowToast(Z)V
/* .line 100 */
/* new-instance v0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;-><init>(Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$1;)V */
/* new-array v1, v2, [Ljava/lang/Void; */
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
} // .end method
public void track ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "showToast" # Z */
/* .prologue */
/* .line 92 */
v0 = (( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).hasRunBefore ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->hasRunBefore()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 95 */
} // :goto_0
return;
/* .line 93 */
} // :cond_0
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) p0 ).setShowToast ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->setShowToast(Z)V
/* .line 94 */
/* new-instance v0, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;-><init>(Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$1;)V */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Void; */
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
} // .end method
