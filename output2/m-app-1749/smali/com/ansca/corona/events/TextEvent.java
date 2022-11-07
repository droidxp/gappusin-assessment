public class com.ansca.corona.events.TextEvent extends com.ansca.corona.events.Event {
	 /* .source "TextEvent.java" */
	 /* # instance fields */
	 private Integer myEditTextId;
	 private Boolean myHasFocus;
	 private Boolean myIsDone;
	 /* # direct methods */
	 public com.ansca.corona.events.TextEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "f" # Z */
		 /* .param p3, "done" # Z */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 13 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TextEvent;->myEditTextId:I */
		 /* .line 14 */
		 /* iput-boolean p2, p0, Lcom/ansca/corona/events/TextEvent;->myHasFocus:Z */
		 /* .line 15 */
		 /* iput-boolean p3, p0, Lcom/ansca/corona/events/TextEvent;->myIsDone:Z */
		 /* .line 16 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 21 */
		 com.ansca.corona.ViewManager .getViewManager ( );
		 /* iget v1, p0, Lcom/ansca/corona/events/TextEvent;->myEditTextId:I */
		 v0 = 		 (( com.ansca.corona.ViewManager ) v0 ).hasTextView ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/ViewManager;->hasTextView(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 22 */
			 /* iget v0, p0, Lcom/ansca/corona/events/TextEvent;->myEditTextId:I */
			 /* iget-boolean v1, p0, Lcom/ansca/corona/events/TextEvent;->myHasFocus:Z */
			 /* iget-boolean v2, p0, Lcom/ansca/corona/events/TextEvent;->myIsDone:Z */
			 com.ansca.corona.JavaToNativeShim .textEvent ( v0,v1,v2 );
			 /* .line 24 */
		 } // :cond_0
		 return;
	 } // .end method
