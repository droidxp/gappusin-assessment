class com.ansca.corona.CoronaEditText$1 implements android.view.View$OnFocusChangeListener {
	 /* .source "CoronaEditText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaEditText;-><init>(Landroid/content/Context;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaEditText this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaEditText$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 42 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFocusChange ( android.view.View p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/view/View; */
/* .param p2, "hasFocus" # Z */
/* .prologue */
/* .line 45 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = this.this$0;
	 v0 = 	 com.ansca.corona.CoronaEditText .access$000 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 47 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 49 */
			 v0 = this.this$0;
			 int v1 = 1; // const/4 v1, 0x1
			 com.ansca.corona.CoronaEditText .access$102 ( v0,v1 );
			 /* .line 51 */
		 } // :cond_0
		 com.ansca.corona.Controller .getEventManager ( );
		 v1 = this.this$0;
		 v1 = 		 com.ansca.corona.CoronaEditText .access$000 ( v1 );
		 int v2 = 0; // const/4 v2, 0x0
		 (( com.ansca.corona.events.EventManager ) v0 ).textEvent ( v1, p2, v2 ); // invoke-virtual {v0, v1, p2, v2}, Lcom/ansca/corona/events/EventManager;->textEvent(IZZ)V
		 /* .line 53 */
	 } // :cond_1
	 return;
} // .end method
