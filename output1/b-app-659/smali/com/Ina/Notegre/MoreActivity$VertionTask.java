class com.Ina.Notegre.MoreActivity$VertionTask extends android.os.AsyncTask {
	 /* .source "MoreActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/Ina/Notegre/MoreActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "VertionTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
java.lang.String mLoadString;
final com.Ina.Notegre.MoreActivity this$0; //synthetic
/* # direct methods */
private com.Ina.Notegre.MoreActivity$VertionTask ( ) {
/* .locals 0 */
/* .prologue */
/* .line 437 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
return;
} // .end method
 com.Ina.Notegre.MoreActivity$VertionTask ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 437 */
/* invoke-direct {p0, p1}, Lcom/Ina/Notegre/MoreActivity$VertionTask;-><init>(Lcom/Ina/Notegre/MoreActivity;)V */
return;
} // .end method
static com.Ina.Notegre.MoreActivity access$3 ( com.Ina.Notegre.MoreActivity$VertionTask p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 437 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
protected java.lang.Integer doInBackground ( java.lang.Integer...p0 ) {
/* .locals 6 */
/* .param p1, "params" # [Ljava/lang/Integer; */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 443 */
/* aget-object v3, p1, v5 */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* if-nez v3, :cond_0 */
/* .line 445 */
/* new-instance v1, Lcom/Ina/Control/NetWorkData; */
/* invoke-direct {v1}, Lcom/Ina/Control/NetWorkData;-><init>()V */
/* .line 446 */
/* .local v1, "nwData":Lcom/Ina/Control/NetWorkData; */
int v0 = 0; // const/4 v0, 0x0
/* .line 448 */
/* .local v0, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
(( com.Ina.Control.NetWorkData ) v1 ).getUpdateData ( ); // invoke-virtual {v1}, Lcom/Ina/Control/NetWorkData;->getUpdateData()Ljava/util/HashMap;
/* .line 450 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 452 */
final String v3 = "version"; // const-string v3, "version"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
v2 = java.lang.Float .parseFloat ( v3 );
/* .line 454 */
/* .local v2, "ver":F */
/* const/high16 v3, 0x40400000 # 3.0f */
/* cmpl-float v3, v2, v3 */
/* if-lez v3, :cond_1 */
/* .line 456 */
final String v3 = "address"; // const-string v3, "address"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
this.mLoadString = v3;
/* .line 457 */
/* new-array v3, v4, [Ljava/lang/Integer; */
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v3, v5 */
(( com.Ina.Notegre.MoreActivity$VertionTask ) p0 ).publishProgress ( v3 ); // invoke-virtual {p0, v3}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->publishProgress([Ljava/lang/Object;)V
/* .line 470 */
} // .end local v0 # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v1 # "nwData":Lcom/Ina/Control/NetWorkData;
} // .end local v2 # "ver":F
} // :cond_0
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
/* .line 460 */
/* .restart local v0 # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* .restart local v1 # "nwData":Lcom/Ina/Control/NetWorkData; */
/* .restart local v2 # "ver":F */
} // :cond_1
/* new-array v3, v4, [Ljava/lang/Integer; */
int v4 = -1; // const/4 v4, -0x1
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v3, v5 */
(( com.Ina.Notegre.MoreActivity$VertionTask ) p0 ).publishProgress ( v3 ); // invoke-virtual {p0, v3}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->publishProgress([Ljava/lang/Object;)V
/* .line 465 */
} // .end local v2 # "ver":F
} // :cond_2
/* new-array v3, v4, [Ljava/lang/Integer; */
java.lang.Integer .valueOf ( v5 );
/* aput-object v4, v3, v5 */
(( com.Ina.Notegre.MoreActivity$VertionTask ) p0 ).publishProgress ( v3 ); // invoke-virtual {p0, v3}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->publishProgress([Ljava/lang/Object;)V
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Integer; */
(( com.Ina.Notegre.MoreActivity$VertionTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->doInBackground([Ljava/lang/Integer;)Ljava/lang/Integer;
} // .end method
protected void onProgressUpdate ( java.lang.Integer...p0 ) {
/* .locals 3 */
/* .param p1, "values" # [Ljava/lang/Integer; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 476 */
/* aget-object v0, p1, v2 */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-nez v0, :cond_1 */
/* .line 478 */
v0 = this.this$0;
/* const v1, 0x7f07002a */
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 513 */
} // :cond_0
} // :goto_0
/* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V */
/* .line 514 */
return;
/* .line 480 */
} // :cond_1
/* aget-object v0, p1, v2 */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_2 */
/* .line 482 */
v0 = this.this$0;
/* const v1, 0x7f07002b */
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 484 */
} // :cond_2
/* aget-object v0, p1, v2 */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 486 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
v1 = this.this$0;
/* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* const v1, 0x7f07002c */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
/* .line 487 */
/* const v1, 0x7f07002d */
/* .line 486 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
/* .line 487 */
/* const v1, 0x7f070011 */
/* .line 488 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$VertionTask$1; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$VertionTask$1;-><init>(Lcom/Ina/Notegre/MoreActivity$VertionTask;)V */
/* .line 487 */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 500 */
/* const v1, 0x7f070012 */
/* .line 501 */
/* new-instance v2, Lcom/Ina/Notegre/MoreActivity$VertionTask$2; */
/* invoke-direct {v2, p0}, Lcom/Ina/Notegre/MoreActivity$VertionTask$2;-><init>(Lcom/Ina/Notegre/MoreActivity$VertionTask;)V */
/* .line 500 */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 511 */
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
} // .end method
protected void onProgressUpdate ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 0 */
/* .prologue */
/* .line 1 */
/* check-cast p1, [Ljava/lang/Integer; */
(( com.Ina.Notegre.MoreActivity$VertionTask ) p0 ).onProgressUpdate ( p1 ); // invoke-virtual {p0, p1}, Lcom/Ina/Notegre/MoreActivity$VertionTask;->onProgressUpdate([Ljava/lang/Integer;)V
return;
} // .end method
