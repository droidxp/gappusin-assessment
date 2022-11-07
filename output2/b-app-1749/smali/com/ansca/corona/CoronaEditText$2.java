class com.ansca.corona.CoronaEditText$2 implements android.widget.TextView$OnEditorActionListener {
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
 com.ansca.corona.CoronaEditText$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 56 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onEditorAction ( android.widget.TextView p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 5 */
/* .param p1, "view" # Landroid/widget/TextView; */
/* .param p2, "actionId" # I */
/* .param p3, "arg2" # Landroid/view/KeyEvent; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 60 */
v3 = this.this$0;
com.ansca.corona.CoronaEditText .access$102 ( v3,v2 );
/* .line 63 */
v3 = this.this$0;
v3 = (( com.ansca.corona.CoronaEditText ) v3 ).getInputType ( ); // invoke-virtual {v3}, Lcom/ansca/corona/CoronaEditText;->getInputType()I
/* const/high16 v4, 0x20000 */
/* and-int/2addr v3, v4 */
/* if-nez v3, :cond_1 */
/* move v0, v1 */
/* .line 64 */
/* .local v0, "isSingleLine":Z */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
v3 = this.this$0;
v3 = com.ansca.corona.CoronaEditText .access$000 ( v3 );
if ( v3 != null) { // if-eqz v3, :cond_0
	 v3 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 65 */
		 com.ansca.corona.Controller .getEventManager ( );
		 v4 = this.this$0;
		 v4 = 		 com.ansca.corona.CoronaEditText .access$000 ( v4 );
		 (( com.ansca.corona.events.EventManager ) v3 ).textEvent ( v4, v2, v1 ); // invoke-virtual {v3, v4, v2, v1}, Lcom/ansca/corona/events/EventManager;->textEvent(IZZ)V
		 /* .line 69 */
	 } // :cond_0
} // .end local v0 # "isSingleLine":Z
} // :cond_1
/* move v0, v2 */
/* .line 63 */
} // .end method
