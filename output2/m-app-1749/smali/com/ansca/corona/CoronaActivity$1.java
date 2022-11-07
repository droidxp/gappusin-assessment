class com.ansca.corona.CoronaActivity$1 extends android.view.OrientationEventListener {
	 /* .source "CoronaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaActivity$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Landroid/content/Context; */
/* .prologue */
/* .line 174 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V */
return;
} // .end method
/* # virtual methods */
public void onOrientationChanged ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "orientationInDegrees" # I */
/* .prologue */
/* .line 178 */
int v1 = -1; // const/4 v1, -0x1
/* if-ne p1, v1, :cond_1 */
/* .line 199 */
} // :cond_0
} // :goto_0
return;
/* .line 183 */
} // :cond_1
v1 = com.ansca.corona.Controller .isValid ( );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.this$0;
com.ansca.corona.CoronaActivity .access$000 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.this$0;
v1 = com.ansca.corona.CoronaActivity .access$000 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 188 */
/* rsub-int v1, p1, 0x168 */
/* rem-int/lit16 p1, v1, 0x168 */
/* .line 191 */
v1 = this.this$0;
v0 = com.ansca.corona.CoronaActivity .access$100 ( v1,p1 );
/* .line 192 */
/* .local v0, "currentOrientation":I */
v1 = this.this$0;
v1 = com.ansca.corona.CoronaActivity .access$200 ( v1 );
/* if-ne v0, v1, :cond_2 */
v1 = this.this$0;
v1 = com.ansca.corona.CoronaActivity .access$300 ( v1 );
/* if-nez v1, :cond_0 */
/* .line 193 */
} // :cond_2
v1 = this.this$0;
v2 = this.this$0;
v2 = com.ansca.corona.CoronaActivity .access$200 ( v2 );
com.ansca.corona.CoronaActivity .access$302 ( v1,v2 );
/* .line 194 */
v1 = this.this$0;
com.ansca.corona.CoronaActivity .access$202 ( v1,v0 );
/* .line 195 */
v1 = this.this$0;
v1 = (( com.ansca.corona.CoronaActivity ) v1 ).hasFixedOrientation ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->hasFixedOrientation()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 196 */
com.ansca.corona.Controller .getEventManager ( );
v2 = this.this$0;
v2 = com.ansca.corona.CoronaActivity .access$200 ( v2 );
v3 = this.this$0;
v3 = com.ansca.corona.CoronaActivity .access$300 ( v3 );
(( com.ansca.corona.events.EventManager ) v1 ).orientationChanged ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->orientationChanged(II)V
} // .end method
