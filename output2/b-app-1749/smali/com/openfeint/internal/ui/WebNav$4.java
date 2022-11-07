class com.openfeint.internal.ui.WebNav$4 implements java.lang.Runnable {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->closeForDiskError()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 185 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 188 */
v1 = this.this$0;
com.openfeint.internal.ui.WebNav .access$200 ( v1 );
/* .line 189 */
v1 = this.this$0;
v1 = com.openfeint.internal.Util .sdcardReady ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
	 /* .line 191 */
	 /* .local v0, "place":Ljava/lang/String; */
} // :goto_0
/* new-instance v1, Landroid/app/AlertDialog$Builder; */
v2 = this.this$0;
/* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
com.openfeint.internal.OpenFeintInternal .getRString ( v2 );
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v0, v3, v4 */
java.lang.String .format ( v2,v3 );
(( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v2 );
/* new-instance v3, Lcom/openfeint/internal/ui/WebNav$4$1; */
/* invoke-direct {v3, p0}, Lcom/openfeint/internal/ui/WebNav$4$1;-><init>(Lcom/openfeint/internal/ui/WebNav$4;)V */
(( android.app.AlertDialog$Builder ) v1 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
/* .line 199 */
return;
/* .line 189 */
} // .end local v0 # "place":Ljava/lang/String;
} // :cond_0
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
} // .end method
