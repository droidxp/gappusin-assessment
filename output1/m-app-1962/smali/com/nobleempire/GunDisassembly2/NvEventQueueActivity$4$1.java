class com.nobleempire.GunDisassembly2.NvEventQueueActivity$4$1 implements android.content.DialogInterface$OnClickListener {
	 /* .source "NvEventQueueActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity$4 this$1; //synthetic
private final Integer val$f_dlg_id; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.NvEventQueueActivity$4$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* iput p2, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4$1;->val$f_dlg_id:I */
/* .line 872 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "i" # Landroid/content/DialogInterface; */
/* .param p2, "a" # I */
/* .prologue */
/* .line 874 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~Input Ok"; // const-string v1, "~~Input Ok"
android.util.Log .v ( v0,v1 );
/* .line 875 */
v0 = this.this$1;
com.nobleempire.GunDisassembly2.NvEventQueueActivity$4 .access$0 ( v0 );
/* iget v1, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$4$1;->val$f_dlg_id:I */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v0 ).nvInputBoxHandler ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->nvInputBoxHandler(IILjava/lang/String;)V
/* .line 876 */
return;
} // .end method
