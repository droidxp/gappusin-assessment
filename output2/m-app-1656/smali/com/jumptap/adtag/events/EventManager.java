public class com.jumptap.adtag.events.EventManager {
	 /* .source "EventManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/events/EventManager$1;, */
	 /* Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;, */
	 /* Lcom/jumptap/adtag/events/EventManager$InteractEventTask;, */
	 /* Lcom/jumptap/adtag/events/EventManager$LogEvent; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String AD_REQUEST_ID_STRING;
private static final java.lang.String AMP_STRING;
public static final java.lang.String APP_ID_STRING;
public static final java.lang.String APP_VER_STRING;
private static final java.lang.String CONVERSION_TRACKING_URL;
private static final java.lang.String DATE_FORMAT;
public static final java.lang.String DATE_STRING;
public static final Integer DELAY_AFTER_INTERACTION;
private static final java.lang.String DURATION_STRING;
private static final java.lang.String EQUAL_STRING;
public static final java.lang.String EVENT_STRING;
private static final java.lang.String FIRST_LAUNCH;
public static final java.lang.String HID_STRING;
protected static final java.lang.String INSTALL_DATE_PREF_NAME;
protected static final java.lang.String IS_FIRST_PREF_NAME;
protected static final java.lang.String JT_AD_TRACKING;
protected static final java.lang.String NOT_FIRST_LAUNCH;
private static final java.lang.String PUB_STRING;
private static final java.lang.String SPOT_STRING;
private static final java.lang.String UNITS_STRING;
private static java.util.Timer eventTimer;
/* # instance fields */
private com.jumptap.adtag.listeners.JtAdViewInnerListener adViewListener;
private android.content.Context context;
private com.jumptap.adtag.events.EventManager$EventInteractionInfo eventInteractionInfo;
private com.jumptap.adtag.events.EventManager$InteractEventTask interEventTask;
/* # direct methods */
public com.jumptap.adtag.events.EventManager ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "adViewListener" # Lcom/jumptap/adtag/listeners/JtAdViewInnerListener; */
	 /* .prologue */
	 /* .line 51 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 52 */
	 this.context = p1;
	 /* .line 53 */
	 this.adViewListener = p2;
	 /* .line 54 */
	 /* new-instance v0, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo; */
	 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;-><init>(Lcom/jumptap/adtag/events/EventManager;)V */
	 this.eventInteractionInfo = v0;
	 /* .line 56 */
	 com.jumptap.adtag.events.EventManager .initTimer ( );
	 /* .line 57 */
	 com.jumptap.adtag.events.EventManager .scheduleConversionTask ( p1 );
	 /* .line 58 */
	 return;
} // .end method
static void access$100 ( android.content.Context p0 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 22 */
	 com.jumptap.adtag.events.EventManager .scheduleConversionTask ( p0 );
	 return;
} // .end method
static com.jumptap.adtag.events.EventManager$EventInteractionInfo access$200 ( com.jumptap.adtag.events.EventManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/jumptap/adtag/events/EventManager; */
	 /* .prologue */
	 /* .line 22 */
	 v0 = this.eventInteractionInfo;
} // .end method
static void access$300 ( com.jumptap.adtag.events.EventManager p0, com.jumptap.adtag.events.EventType p1, java.util.Map p2 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/jumptap/adtag/events/EventManager; */
	 /* .param p1, "x1" # Lcom/jumptap/adtag/events/EventType; */
	 /* .param p2, "x2" # Ljava/util/Map; */
	 /* .prologue */
	 /* .line 22 */
	 /* invoke-direct {p0, p1, p2}, Lcom/jumptap/adtag/events/EventManager;->sendReport(Lcom/jumptap/adtag/events/EventType;Ljava/util/Map;)V */
	 return;
} // .end method
static com.jumptap.adtag.listeners.JtAdViewInnerListener access$400 ( com.jumptap.adtag.events.EventManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/jumptap/adtag/events/EventManager; */
	 /* .prologue */
	 /* .line 22 */
	 v0 = this.adViewListener;
} // .end method
public static java.lang.String buildEventTrackingUrl ( java.util.Map p0 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;)", */
	 /* "Ljava/lang/String;" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 148 */
/* .local p0, "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "http://a.jumptap.com/a/conversion?"; // const-string v4, "http://a.jumptap.com/a/conversion?"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 151 */
/* .local v3, "url":Ljava/lang/StringBuilder; */
	 v4 = if ( p0 != null) { // if-eqz p0, :cond_0
	 /* if-lez v4, :cond_0 */
	 /* .line 152 */
	 /* .line 154 */
	 /* .local v1, "entrySet":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;" */
	 /* .local v2, "i$":Ljava/util/Iterator; */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
	 /* check-cast v0, Ljava/util/Map$Entry; */
	 /* .line 155 */
	 /* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;" */
	 final String v4 = "&"; // const-string v4, "&"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 156 */
	 /* check-cast v4, Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 157 */
	 final String v4 = "="; // const-string v4, "="
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 158 */
	 /* check-cast v4, Ljava/lang/String; */
	 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v4 );
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 161 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
} // .end local v1 # "entrySet":Ljava/util/Set;, "Ljava/util/Set<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;>;"
} // .end local v2 # "i$":Ljava/util/Iterator;
} // :cond_0
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String getDateByEventType ( com.jumptap.adtag.events.EventType p0, android.content.Context p1 ) {
/* .locals 4 */
/* .param p0, "eventType" # Lcom/jumptap/adtag/events/EventType; */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 173 */
int v0 = 0; // const/4 v0, 0x0
/* .line 175 */
/* .local v0, "date":Ljava/lang/String; */
v3 = com.jumptap.adtag.events.EventType.install;
v3 = (( com.jumptap.adtag.events.EventType ) v3 ).equals ( p0 ); // invoke-virtual {v3, p0}, Lcom/jumptap/adtag/events/EventType;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 176 */
com.jumptap.adtag.events.EventManager .getDateForInstallEvent ( p1 );
/* .line 183 */
} // :goto_0
/* .line 179 */
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
/* .line 180 */
/* .local v1, "timeMillis":J */
final String v3 = "yyyyMMddhhmmss"; // const-string v3, "yyyyMMddhhmmss"
android.text.format.DateFormat .format ( v3,v1,v2 );
} // .end local v0 # "date":Ljava/lang/String;
/* check-cast v0, Ljava/lang/String; */
/* .restart local v0 # "date":Ljava/lang/String; */
} // .end method
private static java.lang.String getDateForInstallEvent ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 193 */
final String v4 = "installDate"; // const-string v4, "installDate"
int v5 = 0; // const/4 v5, 0x0
com.jumptap.adtag.utils.JtAdManager .getPreferences ( p0,v4,v5 );
/* .line 195 */
/* .local v1, "dateFromPref":Ljava/lang/String; */
/* if-nez v1, :cond_0 */
/* .line 196 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* .line 197 */
/* .local v2, "timeMillis":J */
final String v4 = "yyyyMMddhhmmss"; // const-string v4, "yyyyMMddhhmmss"
android.text.format.DateFormat .format ( v4,v2,v3 );
/* check-cast v0, Ljava/lang/String; */
/* .line 202 */
} // .end local v2 # "timeMillis":J
/* .local v0, "date":Ljava/lang/String; */
} // :goto_0
/* .line 200 */
} // .end local v0 # "date":Ljava/lang/String;
} // :cond_0
/* move-object v0, v1 */
/* .restart local v0 # "date":Ljava/lang/String; */
} // .end method
public static java.lang.String getFirstLaunchStr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
final String v0 = "1"; // const-string v0, "1"
} // .end method
public static java.lang.String getFirstPrefName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 135 */
final String v0 = "isFirstLaunch"; // const-string v0, "isFirstLaunch"
} // .end method
private static void initTimer ( ) {
/* .locals 2 */
/* .prologue */
/* .line 251 */
v0 = com.jumptap.adtag.events.EventManager.eventTimer;
/* if-nez v0, :cond_0 */
/* .line 252 */
/* new-instance v0, Ljava/util/Timer; */
final String v1 = "EventManagerTimer"; // const-string v1, "EventManagerTimer"
/* invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V */
/* .line 254 */
} // :cond_0
return;
} // .end method
private void populateParamsMap ( android.content.Context p0, com.jumptap.adtag.listeners.JtAdViewInnerListener p1, com.jumptap.adtag.events.EventType p2, java.lang.String p3, java.util.Map p4 ) {
/* .locals 5 */
/* .param p1, "con" # Landroid/content/Context; */
/* .param p2, "adViewLst" # Lcom/jumptap/adtag/listeners/JtAdViewInnerListener; */
/* .param p3, "eventType" # Lcom/jumptap/adtag/events/EventType; */
/* .param p4, "date" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;", */
/* "Lcom/jumptap/adtag/events/EventType;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 217 */
/* .local p5, "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.jumptap.adtag.utils.JtAdManager .getHID ( p1 );
/* .line 218 */
/* .local v2, "hid":Ljava/lang/String; */
(( com.jumptap.adtag.JtAdWidgetSettings ) v3 ).getApplicationId ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationId()Ljava/lang/String;
/* .line 219 */
/* .local v0, "appId":Ljava/lang/String; */
(( com.jumptap.adtag.JtAdWidgetSettings ) v3 ).getApplicationVersion ( ); // invoke-virtual {v3}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationVersion()Ljava/lang/String;
/* .line 220 */
/* .local v1, "appVer":Ljava/lang/String; */
final String v3 = "event"; // const-string v3, "event"
(( com.jumptap.adtag.events.EventType ) p3 ).value ( ); // invoke-virtual {p3}, Lcom/jumptap/adtag/events/EventType;->value()Ljava/lang/String;
/* .line 221 */
final String v3 = "hid"; // const-string v3, "hid"
/* .line 222 */
final String v3 = "app"; // const-string v3, "app"
/* .line 223 */
final String v3 = "appVer"; // const-string v3, "appVer"
/* .line 224 */
final String v3 = "date"; // const-string v3, "date"
/* .line 225 */
final String v3 = "jtreqid"; // const-string v3, "jtreqid"
/* .line 226 */
final String v3 = "pub"; // const-string v3, "pub"
(( com.jumptap.adtag.JtAdWidgetSettings ) v4 ).getPublisherId ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getPublisherId()Ljava/lang/String;
/* .line 227 */
final String v3 = "spot"; // const-string v3, "spot"
(( com.jumptap.adtag.JtAdWidgetSettings ) v4 ).getSpotId ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getSpotId()Ljava/lang/String;
/* .line 228 */
return;
} // .end method
private static void scheduleConversionTask ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 261 */
/* new-instance v0, Lcom/jumptap/adtag/events/SendConversionUrlTask; */
/* invoke-direct {v0, p0}, Lcom/jumptap/adtag/events/SendConversionUrlTask;-><init>(Landroid/content/Context;)V */
/* .line 262 */
/* .local v0, "sendUrlConversionTask":Ljava/util/TimerTask; */
v1 = com.jumptap.adtag.events.EventManager.eventTimer;
/* const-wide/16 v2, 0x0 */
(( java.util.Timer ) v1 ).schedule ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 263 */
return;
} // .end method
public static void sendReport ( android.content.Context p0, java.lang.String p1, com.jumptap.adtag.events.EventType p2, java.lang.String p3 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "eventType" # Lcom/jumptap/adtag/events/EventType; */
/* .param p3, "date" # Ljava/lang/String; */
/* .prologue */
/* .line 241 */
com.jumptap.adtag.events.EventManager .initTimer ( );
/* .line 242 */
/* new-instance v0, Lcom/jumptap/adtag/events/EventManager$LogEvent; */
/* new-instance v2, Lcom/jumptap/adtag/events/JtEvent; */
/* invoke-direct {v2, p1, p2, p3}, Lcom/jumptap/adtag/events/JtEvent;-><init>(Ljava/lang/String;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;)V */
/* invoke-direct {v0, p0, v2}, Lcom/jumptap/adtag/events/EventManager$LogEvent;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/events/JtEvent;)V */
/* .line 243 */
/* .local v0, "logEvent":Ljava/lang/Runnable; */
/* new-instance v1, Ljava/lang/Thread; */
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 244 */
/* .local v1, "th":Ljava/lang/Thread; */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 245 */
return;
} // .end method
private void sendReport ( com.jumptap.adtag.events.EventType p0, java.util.Map p1 ) {
/* .locals 7 */
/* .param p1, "eventType" # Lcom/jumptap/adtag/events/EventType; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/jumptap/adtag/events/EventType;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 80 */
/* .local p2, "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "sendReport: eventType="; // const-string v2, "sendReport: eventType="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.jumptap.adtag.events.EventType ) p1 ).name ( ); // invoke-virtual {p1}, Lcom/jumptap/adtag/events/EventType;->name()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 82 */
v0 = this.context;
com.jumptap.adtag.events.EventManager .getDateByEventType ( p1,v0 );
/* .line 85 */
/* .local v4, "date":Ljava/lang/String; */
/* if-nez p2, :cond_0 */
/* .line 86 */
/* new-instance p2, Ljava/util/HashMap; */
} // .end local p2 # "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
/* invoke-direct {p2}, Ljava/util/HashMap;-><init>()V */
/* .line 88 */
/* .restart local p2 # "paramMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
} // :cond_0
v1 = this.context;
v2 = this.adViewListener;
/* move-object v0, p0 */
/* move-object v3, p1 */
/* move-object v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/jumptap/adtag/events/EventManager;->populateParamsMap(Landroid/content/Context;Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;Lcom/jumptap/adtag/events/EventType;Ljava/lang/String;Ljava/util/Map;)V */
/* .line 91 */
com.jumptap.adtag.events.EventManager .buildEventTrackingUrl ( p2 );
/* .line 94 */
/* .local v6, "eventTrackingUrl":Ljava/lang/String; */
v0 = this.context;
com.jumptap.adtag.events.EventManager .sendReport ( v0,v6,p1,v4 );
/* .line 95 */
return;
} // .end method
private void startTimer ( ) {
/* .locals 4 */
/* .prologue */
/* .line 269 */
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
final String v1 = "Starting Interaction Event Task timer"; // const-string v1, "Starting Interaction Event Task timer"
android.util.Log .i ( v0,v1 );
/* .line 271 */
v0 = this.interEventTask;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 272 */
v0 = this.interEventTask;
(( com.jumptap.adtag.events.EventManager$InteractEventTask ) v0 ).cancel ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/events/EventManager$InteractEventTask;->cancel()Z
/* .line 274 */
} // :cond_0
/* new-instance v0, Lcom/jumptap/adtag/events/EventManager$InteractEventTask; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/jumptap/adtag/events/EventManager$InteractEventTask;-><init>(Lcom/jumptap/adtag/events/EventManager;Lcom/jumptap/adtag/events/EventManager$1;)V */
this.interEventTask = v0;
/* .line 275 */
v0 = com.jumptap.adtag.events.EventManager.eventTimer;
v1 = this.interEventTask;
/* const-wide/32 v2, 0xea60 */
(( java.util.Timer ) v0 ).schedule ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 277 */
return;
} // .end method
private void stopTimer ( ) {
/* .locals 2 */
/* .prologue */
/* .line 283 */
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
final String v1 = "stopping Interaction Event Task timer"; // const-string v1, "stopping Interaction Event Task timer"
android.util.Log .i ( v0,v1 );
/* .line 284 */
v0 = this.interEventTask;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 285 */
v0 = this.interEventTask;
(( com.jumptap.adtag.events.EventManager$InteractEventTask ) v0 ).cancel ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/events/EventManager$InteractEventTask;->cancel()Z
/* .line 287 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 2 */
/* .prologue */
/* .line 70 */
v1 = this.context;
com.jumptap.adtag.db.DBManager .getInstance ( v1 );
/* .line 71 */
/* .local v0, "dbManager":Lcom/jumptap/adtag/db/DBManager; */
(( com.jumptap.adtag.db.DBManager ) v0 ).close ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/db/DBManager;->close()V
/* .line 72 */
return;
} // .end method
public void forceSendingInteractEvent ( ) {
/* .locals 3 */
/* .prologue */
/* .line 128 */
(( com.jumptap.adtag.events.EventManager ) p0 ).stopInteraction ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/events/EventManager;->stopInteraction()V
/* .line 129 */
final String v1 = "JtAd-Tracking"; // const-string v1, "JtAd-Tracking"
final String v2 = "forceSendingInteractEvent"; // const-string v2, "forceSendingInteractEvent"
android.util.Log .d ( v1,v2 );
/* .line 130 */
/* new-instance v0, Ljava/lang/Thread; */
v1 = this.interEventTask;
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 131 */
/* .local v0, "th":Ljava/lang/Thread; */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 132 */
return;
} // .end method
public void sendReport ( com.jumptap.adtag.events.EventType p0 ) {
/* .locals 1 */
/* .param p1, "eventType" # Lcom/jumptap/adtag/events/EventType; */
/* .prologue */
/* .line 66 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/jumptap/adtag/events/EventManager;->sendReport(Lcom/jumptap/adtag/events/EventType;Ljava/util/Map;)V */
/* .line 67 */
return;
} // .end method
public void startInteraction ( ) {
/* .locals 2 */
/* .prologue */
/* .line 102 */
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
final String v1 = "startInteraction"; // const-string v1, "startInteraction"
android.util.Log .d ( v0,v1 );
/* .line 103 */
v0 = this.eventInteractionInfo;
(( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) v0 ).interactionStarted ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->interactionStarted()V
/* .line 104 */
v0 = this.adViewListener;
/* .line 106 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/events/EventManager;->stopTimer()V */
/* .line 107 */
return;
} // .end method
public void stopInteraction ( ) {
/* .locals 2 */
/* .prologue */
/* .line 114 */
final String v0 = "JtAd-Tracking"; // const-string v0, "JtAd-Tracking"
final String v1 = "stopInteraction"; // const-string v1, "stopInteraction"
android.util.Log .d ( v0,v1 );
/* .line 115 */
v0 = this.eventInteractionInfo;
(( com.jumptap.adtag.events.EventManager$EventInteractionInfo ) v0 ).interactionEnded ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/events/EventManager$EventInteractionInfo;->interactionEnded()V
/* .line 116 */
v0 = this.adViewListener;
/* .line 118 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/events/EventManager;->startTimer()V */
/* .line 119 */
return;
} // .end method
