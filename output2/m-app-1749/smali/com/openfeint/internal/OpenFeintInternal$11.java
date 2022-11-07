class com.openfeint.internal.OpenFeintInternal$11 implements java.lang.Runnable {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->launchIntroFlow(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final Boolean val$spotlight; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$11 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 971 */
this.this$0 = p1;
/* iput-boolean p2, p0, Lcom/openfeint/internal/OpenFeintInternal$11;->val$spotlight:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 973 */
/* new-instance v0, Landroid/content/Intent; */
v1 = this.this$0;
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* const-class v2, Lcom/openfeint/internal/ui/IntroFlow; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 974 */
/* .local v0, "i":Landroid/content/Intent; */
v1 = this.this$0;
v1 = com.openfeint.internal.OpenFeintInternal .access$1500 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal$11;->val$spotlight:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 975 */
		 final String v1 = "content_name"; // const-string v1, "content_name"
		 final String v2 = "index?preapproved=true&spotlight=true"; // const-string v2, "index?preapproved=true&spotlight=true"
		 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 981 */
	 } // :cond_0
} // :goto_0
/* const/high16 v1, 0x10000000 */
(( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 982 */
v1 = this.this$0;
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 983 */
return;
/* .line 976 */
} // :cond_1
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal$11;->val$spotlight:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 977 */
final String v1 = "content_name"; // const-string v1, "content_name"
final String v2 = "index?spotlight=true"; // const-string v2, "index?spotlight=true"
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 978 */
} // :cond_2
v1 = this.this$0;
v1 = com.openfeint.internal.OpenFeintInternal .access$1500 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 979 */
final String v1 = "content_name"; // const-string v1, "content_name"
final String v2 = "index?preapproved=true"; // const-string v2, "index?preapproved=true"
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // .end method
