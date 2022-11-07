class com.Ina.Notegre.NoteText$1 implements android.view.View$OnClickListener {
	 /* .source "NoteText.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/NoteText; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.Ina.Notegre.NoteText this$0; //synthetic
/* # direct methods */
 com.Ina.Notegre.NoteText$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 104 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/view/View; */
/* .prologue */
/* .line 110 */
/* const v0, 0x7f090002 */
v1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* if-ne v0, v1, :cond_1 */
/* .line 112 */
v0 = this.this$0;
v0 = com.Ina.Notegre.NoteText .access$0 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 114 */
	 v0 = this.this$0;
	 com.Ina.Notegre.NoteText .access$1 ( v0 );
	 /* .line 115 */
	 v0 = this.this$0;
	 com.Ina.Notegre.NoteText .access$2 ( v0 );
	 /* .line 124 */
} // :cond_0
} // :goto_0
return;
/* .line 119 */
} // :cond_1
/* const/high16 v0, 0x7f090000 */
v1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* if-ne v0, v1, :cond_0 */
/* .line 121 */
v0 = this.this$0;
(( com.Ina.Notegre.NoteText ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/Ina/Notegre/NoteText;->finish()V
/* .line 122 */
v0 = this.this$0;
com.Ina.Notegre.NoteText .access$3 ( v0 );
} // .end method
