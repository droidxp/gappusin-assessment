public class com.ansca.corona.events.FBConnectEvent extends com.ansca.corona.events.Event {
	 /* .source "FBConnectEvent.java" */
	 /* # static fields */
	 private static final Integer REQUEST;
	 private static final Integer SESSION;
	 private static final Integer SESSION_ERROR;
	 /* # instance fields */
	 private java.lang.String myAccessToken;
	 private Integer myDidComplete;
	 private Boolean myIsError;
	 private java.lang.String myMsg;
	 private Integer myPhase;
	 private Long myTokenExpiration;
	 private Integer myType;
	 /* # direct methods */
	 com.ansca.corona.events.FBConnectEvent ( ) {
		 /* .locals 2 */
		 /* .param p1, "phase" # I */
		 /* .param p2, "accessToken" # Ljava/lang/String; */
		 /* .param p3, "tokenExpiration" # J */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 19 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myType:I */
		 /* .line 20 */
		 /* iput p1, p0, Lcom/ansca/corona/events/FBConnectEvent;->myPhase:I */
		 /* .line 21 */
		 this.myAccessToken = p2;
		 /* .line 25 */
		 /* const-wide/16 v0, 0x3e8 */
		 /* div-long v0, p3, v0 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myTokenExpiration:J */
		 /* .line 26 */
		 return;
	 } // .end method
	 com.ansca.corona.events.FBConnectEvent ( ) {
		 /* .locals 2 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 30 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myType:I */
		 /* .line 31 */
		 final String v0 = ""; // const-string v0, ""
		 this.myAccessToken = v0;
		 /* .line 32 */
		 this.myMsg = p1;
		 /* .line 33 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myTokenExpiration:J */
		 /* .line 34 */
		 return;
	 } // .end method
	 com.ansca.corona.events.FBConnectEvent ( ) {
		 /* .locals 2 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "isError" # Z */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 38 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myType:I */
		 /* .line 39 */
		 final String v0 = ""; // const-string v0, ""
		 this.myAccessToken = v0;
		 /* .line 40 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myTokenExpiration:J */
		 /* .line 41 */
		 this.myMsg = p1;
		 /* .line 42 */
		 /* iput-boolean p2, p0, Lcom/ansca/corona/events/FBConnectEvent;->myIsError:Z */
		 /* .line 43 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myDidComplete:I */
		 /* .line 44 */
		 return;
	 } // .end method
	 com.ansca.corona.events.FBConnectEvent ( ) {
		 /* .locals 2 */
		 /* .param p1, "msg" # Ljava/lang/String; */
		 /* .param p2, "isError" # Z */
		 /* .param p3, "didComplete" # Z */
		 /* .prologue */
		 /* .line 47 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 48 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myType:I */
		 /* .line 49 */
		 final String v0 = ""; // const-string v0, ""
		 this.myAccessToken = v0;
		 /* .line 50 */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myTokenExpiration:J */
		 /* .line 51 */
		 this.myMsg = p1;
		 /* .line 52 */
		 /* iput-boolean p2, p0, Lcom/ansca/corona/events/FBConnectEvent;->myIsError:Z */
		 /* .line 53 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
		 /* iput v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myDidComplete:I */
		 /* .line 54 */
		 return;
		 /* .line 53 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void Send ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 58 */
	 /* iget v0, p0, Lcom/ansca/corona/events/FBConnectEvent;->myType:I */
	 /* packed-switch v0, :pswitch_data_0 */
	 /* .line 71 */
} // :goto_0
return;
/* .line 60 */
/* :pswitch_0 */
/* iget v1, p0, Lcom/ansca/corona/events/FBConnectEvent;->myPhase:I */
v0 = this.myAccessToken;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.myAccessToken;
} // :goto_1
/* iget-wide v2, p0, Lcom/ansca/corona/events/FBConnectEvent;->myTokenExpiration:J */
com.ansca.corona.JavaToNativeShim .fbConnectSessionEvent ( v1,v0,v2,v3 );
} // :cond_0
final String v0 = ""; // const-string v0, ""
/* .line 63 */
/* :pswitch_1 */
v0 = this.myMsg;
com.ansca.corona.JavaToNativeShim .fbConnectSessionEventError ( v0 );
/* .line 66 */
/* :pswitch_2 */
v0 = this.myMsg;
/* iget-boolean v1, p0, Lcom/ansca/corona/events/FBConnectEvent;->myIsError:Z */
/* iget v2, p0, Lcom/ansca/corona/events/FBConnectEvent;->myDidComplete:I */
com.ansca.corona.JavaToNativeShim .fbConnectRequestEvent ( v0,v1,v2 );
/* .line 58 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
