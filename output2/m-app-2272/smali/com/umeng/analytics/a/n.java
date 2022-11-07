public class com.umeng.analytics.a.n {
	 /* .source "Time.java" */
	 /* # instance fields */
	 public java.lang.String g;
	 public java.lang.String h;
	 protected final java.lang.String i;
	 protected final java.lang.String j;
	 /* # direct methods */
	 public com.umeng.analytics.a.n ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 final String v0 = "date"; // const-string v0, "date"
		 this.i = v0;
		 /* .line 19 */
		 final String v0 = "time"; // const-string v0, "time"
		 this.j = v0;
		 /* .line 22 */
		 com.umeng.common.util.h .a ( );
		 /* .line 23 */
		 final String v1 = " "; // const-string v1, " "
		 (( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget-object v1, v1, v2 */
		 this.g = v1;
		 /* .line 24 */
		 final String v1 = " "; // const-string v1, " "
		 (( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget-object v0, v0, v1 */
		 this.h = v0;
		 /* .line 25 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( org.json.JSONObject p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 45 */
	 final String v0 = "date"; // const-string v0, "date"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.g = v0;
	 /* .line 46 */
	 final String v0 = "time"; // const-string v0, "time"
	 (( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
	 this.h = v0;
	 /* .line 47 */
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 28 */
	 v0 = this.g;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.h;
		 /* if-nez v0, :cond_1 */
		 /* .line 29 */
	 } // :cond_0
	 final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
	 final String v1 = "Date or Time is not initialized"; // const-string v1, "Date or Time is not initialized"
	 com.umeng.common.Log .b ( v0,v1 );
	 /* .line 31 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 33 */
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 39 */
final String v0 = "date"; // const-string v0, "date"
v1 = this.g;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 40 */
final String v0 = "time"; // const-string v0, "time"
v1 = this.h;
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 41 */
return;
} // .end method
