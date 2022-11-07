public class com.ansca.corona.events.NetworkRequestEvent extends com.ansca.corona.events.Event {
	 /* .source "NetworkRequestEvent.java" */
	 /* # instance fields */
	 private Boolean myIsError;
	 private Integer myListenerId;
	 private java.lang.String myResponse;
	 private Integer myStatusCode;
	 private java.lang.String myUrl;
	 /* # direct methods */
	 com.ansca.corona.events.NetworkRequestEvent ( ) {
		 /* .locals 6 */
		 /* .param p1, "listenerId" # I */
		 /* .param p2, "response" # Ljava/lang/String; */
		 /* .param p3, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 13 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v5 = -1; // const/4 v5, -0x1
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v4, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/ansca/corona/events/NetworkRequestEvent;-><init>(ILjava/lang/String;ZLjava/lang/String;I)V */
		 /* .line 14 */
		 return;
	 } // .end method
	 com.ansca.corona.events.NetworkRequestEvent ( ) {
		 /* .locals 6 */
		 /* .param p1, "listenerId" # I */
		 /* .param p2, "response" # Ljava/lang/String; */
		 /* .param p3, "url" # Ljava/lang/String; */
		 /* .param p4, "statusCode" # I */
		 /* .prologue */
		 /* .line 18 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v4, p3 */
		 /* move v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/ansca/corona/events/NetworkRequestEvent;-><init>(ILjava/lang/String;ZLjava/lang/String;I)V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.ansca.corona.events.NetworkRequestEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "listenerId" # I */
		 /* .param p2, "response" # Ljava/lang/String; */
		 /* .param p3, "isError" # Z */
		 /* .param p4, "url" # Ljava/lang/String; */
		 /* .param p5, "statusCode" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 23 */
		 /* iput p1, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myListenerId:I */
		 /* .line 24 */
		 this.myResponse = p2;
		 /* .line 25 */
		 /* iput-boolean p3, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myIsError:Z */
		 /* .line 26 */
		 this.myUrl = p4;
		 /* .line 27 */
		 /* iput p5, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myStatusCode:I */
		 /* .line 28 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 32 */
		 /* iget v0, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myListenerId:I */
		 v1 = this.myResponse;
		 /* iget-boolean v2, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myIsError:Z */
		 v3 = this.myUrl;
		 /* iget v4, p0, Lcom/ansca/corona/events/NetworkRequestEvent;->myStatusCode:I */
		 com.ansca.corona.JavaToNativeShim .networkRequestEvent ( v0,v1,v2,v3,v4 );
		 /* .line 33 */
		 return;
	 } // .end method
