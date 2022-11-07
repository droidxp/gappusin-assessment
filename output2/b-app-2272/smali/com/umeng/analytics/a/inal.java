public class inal implements com.umeng.analytics.a.g {
	 /* .source "ULocation.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String d;
	 public static final java.lang.String e;
	 public static final java.lang.String f;
	 private static final java.lang.String g;
	 /* # instance fields */
	 public Double a;
	 public Double b;
	 public Long c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 33 */
		 /* if-nez p1, :cond_0 */
		 /* .line 41 */
	 } // :goto_0
	 return;
	 /* .line 37 */
} // :cond_0
(( android.location.Location ) p1 ).getLongitude ( ); // invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->a:D */
/* .line 38 */
(( android.location.Location ) p1 ).getLatitude ( ); // invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->b:D */
/* .line 40 */
(( android.location.Location ) p1 ).getTime ( ); // invoke-virtual {p1}, Landroid/location/Location;->getTime()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->c:J */
} // .end method
public static android.content.SharedPreferences$Editor a ( android.content.Context p0, android.content.SharedPreferences p1 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 97 */
/* sget-boolean v1, Lcom/umeng/analytics/g;->i:Z */
/* if-nez v1, :cond_1 */
/* .line 117 */
} // :cond_0
} // :goto_0
/* .line 101 */
} // :cond_1
com.umeng.common.b .m ( p0 );
/* .line 103 */
v2 = com.umeng.analytics.a.o .a ( v1,p1 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 105 */
/* .line 107 */
final String v2 = "lng"; // const-string v2, "lng"
(( android.location.Location ) v1 ).getLongitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* .line 108 */
final String v2 = "lat"; // const-string v2, "lat"
(( android.location.Location ) v1 ).getLatitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* .line 110 */
final String v2 = "gps_time"; // const-string v2, "gps_time"
(( android.location.Location ) v1 ).getTime ( ); // invoke-virtual {v1}, Landroid/location/Location;->getTime()J
/* move-result-wide v3 */
/* .line 112 */
} // .end method
public static com.umeng.analytics.a.o a ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 49 */
/* sget-boolean v1, Lcom/umeng/analytics/g;->i:Z */
/* if-nez v1, :cond_1 */
/* .line 60 */
} // :cond_0
} // :goto_0
/* .line 53 */
} // :cond_1
com.umeng.analytics.j .e ( p0 );
/* .line 54 */
com.umeng.common.b .m ( p0 );
/* .line 56 */
v1 = com.umeng.analytics.a.o .a ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 57 */
/* new-instance v0, Lcom/umeng/analytics/a/o; */
/* invoke-direct {v0, v2}, Lcom/umeng/analytics/a/o;-><init>(Landroid/location/Location;)V */
} // .end method
static Boolean a ( android.location.Location p0, android.content.SharedPreferences p1 ) {
/* .locals 5 */
/* .prologue */
/* .line 128 */
if ( p0 != null) { // if-eqz p0, :cond_0
(( android.location.Location ) p0 ).getTime ( ); // invoke-virtual {p0}, Landroid/location/Location;->getTime()J
/* move-result-wide v0 */
final String v2 = "last_gps_change_time"; // const-string v2, "last_gps_change_time"
/* const-wide/16 v3, 0x0 */
/* move-result-wide v2 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 130 */
final String v1 = "last_gps_change_time"; // const-string v1, "last_gps_change_time"
(( android.location.Location ) p0 ).getTime ( ); // invoke-virtual {p0}, Landroid/location/Location;->getTime()J
/* move-result-wide v2 */
/* .line 132 */
int v0 = 1; // const/4 v0, 0x1
/* .line 135 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.umeng.analytics.a.o b ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 69 */
/* sget-boolean v1, Lcom/umeng/analytics/g;->i:Z */
/* if-nez v1, :cond_1 */
/* .line 87 */
} // :cond_0
} // :goto_0
/* .line 73 */
} // :cond_1
com.umeng.analytics.j .e ( p0 );
/* .line 74 */
/* new-instance v1, Lcom/umeng/analytics/a/o; */
/* invoke-direct {v1}, Lcom/umeng/analytics/a/o;-><init>()V */
/* .line 76 */
v3 = final String v3 = "gps_time"; // const-string v3, "gps_time"
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 80 */
v0 = final String v0 = "lat"; // const-string v0, "lat"
/* float-to-double v3, v0 */
/* iput-wide v3, v1, Lcom/umeng/analytics/a/o;->b:D */
/* .line 81 */
v0 = final String v0 = "lng"; // const-string v0, "lng"
/* float-to-double v3, v0 */
/* iput-wide v3, v1, Lcom/umeng/analytics/a/o;->a:D */
/* .line 83 */
final String v0 = "gps_time"; // const-string v0, "gps_time"
/* const-wide/16 v3, 0x0 */
/* move-result-wide v3 */
/* iput-wide v3, v1, Lcom/umeng/analytics/a/o;->c:J */
/* .line 85 */
final String v2 = "gps_time"; // const-string v2, "gps_time"
/* move-object v0, v1 */
/* .line 87 */
} // .end method
/* # virtual methods */
public void a ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 147 */
/* if-nez p1, :cond_1 */
/* .line 160 */
} // :cond_0
} // :goto_0
return;
/* .line 149 */
} // :cond_1
final String v0 = "lng"; // const-string v0, "lng"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 150 */
final String v0 = "lng"; // const-string v0, "lng"
(( org.json.JSONObject ) p1 ).getDouble ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->a:D */
/* .line 153 */
} // :cond_2
final String v0 = "lat"; // const-string v0, "lat"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 154 */
final String v0 = "lat"; // const-string v0, "lat"
(( org.json.JSONObject ) p1 ).getDouble ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->b:D */
/* .line 157 */
} // :cond_3
final String v0 = "gps_time"; // const-string v0, "gps_time"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 158 */
final String v0 = "gps_time"; // const-string v0, "gps_time"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/o;->c:J */
} // .end method
public Boolean a ( ) {
/* .locals 4 */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 164 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/o;->a:D */
/* cmpl-double v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/o;->b:D */
/* cmpl-double v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/o;->c:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-nez v0, :cond_0 */
/* .line 165 */
int v0 = 0; // const/4 v0, 0x0
/* .line 167 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 140 */
final String v0 = "lng"; // const-string v0, "lng"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/o;->a:D */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
/* .line 141 */
final String v0 = "lat"; // const-string v0, "lat"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/o;->b:D */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
/* .line 143 */
final String v0 = "gps_time"; // const-string v0, "gps_time"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/o;->c:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 144 */
return;
} // .end method
