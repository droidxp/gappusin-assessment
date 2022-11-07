public class com.a.f.h {
	 /* # static fields */
	 private static com.a.f.e a;
	 private static com.a.f.d b;
	 /* # direct methods */
	 static com.a.f.h ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/a/f/e; */
		 /* invoke-direct {v0}, Lcom/a/f/e;-><init>()V */
		 /* new-instance v0, Lcom/a/f/d; */
		 /* invoke-direct {v0}, Lcom/a/f/d;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 1 */
		 com.a.f.g .c ( );
		 v0 = 		 java.lang.Integer .parseInt ( v0 );
		 com.a.f.j .c ( );
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :goto_0
	 /* :pswitch_0 */
	 return;
	 /* :pswitch_1 */
	 com.a.f.o .b ( );
	 /* :pswitch_2 */
	 com.a.f.o .d ( );
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
} // .end packed-switch
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 2 */
try { // :try_start_0
	 /* new-instance v0, Lorg/json/JSONObject; */
	 /* invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* if-nez v0, :cond_0 */
} // :goto_1
com.a.f.h .a ( );
return;
} // :cond_0
try { // :try_start_1
v1 = com.a.f.h .a ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
final String v1 = "record_service.txt"; // const-string v1, "record_service.txt"
com.a.f.h .a ( v0,v1,p0 );
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
int v0 = 0; // const/4 v0, 0x0
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static void a ( org.json.JSONObject p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
v0 = com.a.f.h .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "(#)!@&$^*%"; // const-string v0, "(#)!@&$^*%"
com.a.f.c .a ( p2,v0 );
com.a.f.n .a ( );
int v2 = 0; // const/4 v2, 0x0
(( com.a.f.n ) v1 ).a ( v0, p1, v2 ); // invoke-virtual {v1, v0, p1, v2}, Lcom/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;Z)V
} // :cond_0
return;
} // .end method
public static Boolean a ( org.json.JSONObject p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
v1 = com.a.f.h .c ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = com.a.f.h.a;
(( com.a.f.e ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/a/f/e;->a(Lorg/json/JSONObject;)Z
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* if-nez v0, :cond_1 */
v0 = com.a.f.h.b;
v0 = (( com.a.f.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/a/f/d;->a(Lorg/json/JSONObject;)Z
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
com.a.f.n .a ( );
final String v2 = "record_myfee.txt"; // const-string v2, "record_myfee.txt"
(( com.a.f.n ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/f/n;->c(Ljava/lang/String;)V
} // :cond_2
} // .end method
private static Boolean b ( org.json.JSONObject p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "type"; // const-string v1, "type"
(( org.json.JSONObject ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
final String v1 = "serverback"; // const-string v1, "serverback"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catch_0 */
/* move-exception v1 */
} // .end method
private static Boolean c ( org.json.JSONObject p0 ) {
/* .locals 1 */
v0 = com.a.f.h .b ( p0 );
} // .end method
