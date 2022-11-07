public class com.ansca.corona.events.TextEditingEvent extends com.ansca.corona.events.Event {
	 /* .source "TextEditingEvent.java" */
	 /* # instance fields */
	 private Integer myEditTextId;
	 private java.lang.String newCharacters;
	 private java.lang.String newString;
	 private Integer numDeleted;
	 private java.lang.String oldString;
	 private Integer startPos;
	 /* # direct methods */
	 public com.ansca.corona.events.TextEditingEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "start_pos" # I */
		 /* .param p3, "num_deleted" # I */
		 /* .param p4, "new_characters" # Ljava/lang/String; */
		 /* .param p5, "old_string" # Ljava/lang/String; */
		 /* .param p6, "new_string" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 16 */
		 /* iput p1, p0, Lcom/ansca/corona/events/TextEditingEvent;->myEditTextId:I */
		 /* .line 17 */
		 /* iput p2, p0, Lcom/ansca/corona/events/TextEditingEvent;->startPos:I */
		 /* .line 18 */
		 /* iput p3, p0, Lcom/ansca/corona/events/TextEditingEvent;->numDeleted:I */
		 /* .line 19 */
		 this.newCharacters = p4;
		 /* .line 20 */
		 this.oldString = p5;
		 /* .line 21 */
		 this.newString = p6;
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 27 */
		 com.ansca.corona.ViewManager .getViewManager ( );
		 /* iget v1, p0, Lcom/ansca/corona/events/TextEditingEvent;->myEditTextId:I */
		 v0 = 		 (( com.ansca.corona.ViewManager ) v0 ).hasTextView ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/ViewManager;->hasTextView(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 28 */
			 /* iget v0, p0, Lcom/ansca/corona/events/TextEditingEvent;->myEditTextId:I */
			 /* iget v1, p0, Lcom/ansca/corona/events/TextEditingEvent;->startPos:I */
			 /* iget v2, p0, Lcom/ansca/corona/events/TextEditingEvent;->numDeleted:I */
			 v3 = this.newCharacters;
			 v4 = this.oldString;
			 v5 = this.newString;
			 /* invoke-static/range {v0 ..v5}, Lcom/ansca/corona/JavaToNativeShim;->textEditingEvent(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 30 */
		 } // :cond_0
		 return;
	 } // .end method
