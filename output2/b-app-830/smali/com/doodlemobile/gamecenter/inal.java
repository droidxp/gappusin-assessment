class inal extends android.os.AsyncTask {
	 /* # instance fields */
	 private com.doodlemobile.gamecenter.c.c a;
	 private com.doodlemobile.gamecenter.ay b; //synthetic
	 /* # direct methods */
	 inal ( ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lcom/doodlemobile/gamecenter/bd;-><init>(Lcom/doodlemobile/gamecenter/ay;B)V */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
		 /* .locals 3 */
		 /* check-cast p1, [Ljava/lang/String; */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-object v0, p1, v0 */
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/c/c; */
		 v2 = this.b;
		 v2 = this.h;
		 /* invoke-direct {v1, v2, v0}, Lcom/doodlemobile/gamecenter/c/c;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 this.a = v1;
		 v0 = this.b;
		 v1 = this.a;
		 (( com.doodlemobile.gamecenter.ay ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/ay;->a(Lcom/doodlemobile/gamecenter/c/l;)Ljava/lang/Integer;
	 } // .end method
	 protected final void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* check-cast p1, Ljava/lang/Integer; */
		 v0 = this.b;
		 com.doodlemobile.gamecenter.ay .b ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.b;
			 com.doodlemobile.gamecenter.ay .b ( v0 );
			 v0 = 			 (( android.app.ProgressDialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.b;
				 com.doodlemobile.gamecenter.ay .b ( v0 );
				 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
			 } // :cond_0
			 v0 = 			 (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
			 /* if-ne v0, v1, :cond_1 */
			 /* new-instance v0, Ljava/lang/String; */
			 v1 = this.a;
			 v1 = this.c;
			 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
			 a.a.a.d .a ( v0 );
			 /* check-cast v0, La/a/a/c; */
			 v1 = this.b;
			 /* new-instance v2, Lcom/doodlemobile/gamecenter/b/a; */
			 /* invoke-direct {v2}, Lcom/doodlemobile/gamecenter/b/a;-><init>()V */
			 this.c = v2;
			 v1 = this.b;
			 v2 = this.c;
			 final String v1 = "query-user-id"; // const-string v1, "query-user-id"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/String; */
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lcom/doodlemobile/gamecenter/b/a;->a(Ljava/lang/String;)V
			 v1 = this.b;
			 v2 = this.c;
			 final String v1 = "query-user-name"; // const-string v1, "query-user-name"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/String; */
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lcom/doodlemobile/gamecenter/b/a;->b(Ljava/lang/String;)V
			 v1 = this.b;
			 v2 = this.c;
			 final String v1 = "query-user-level"; // const-string v1, "query-user-level"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/Long; */
			 (( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
			 /* move-result-wide v3 */
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).b ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/gamecenter/b/a;->b(J)V
			 v1 = this.b;
			 v2 = this.c;
			 final String v1 = "query-user-xp"; // const-string v1, "query-user-xp"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/Long; */
			 (( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
			 /* move-result-wide v3 */
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/gamecenter/b/a;->a(J)V
			 v1 = this.b;
			 v2 = this.c;
			 final String v1 = "query-user-nextxp"; // const-string v1, "query-user-nextxp"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/Long; */
			 (( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
			 /* move-result-wide v3 */
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).c ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/gamecenter/b/a;->c(J)V
			 v1 = this.b;
			 v1 = this.c;
			 final String v2 = "query-user-totalxp"; // const-string v2, "query-user-totalxp"
			 (( a.a.a.c ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/Long; */
			 (( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
			 /* move-result-wide v2 */
			 (( com.doodlemobile.gamecenter.b.a ) v1 ).d ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/doodlemobile/gamecenter/b/a;->d(J)V
			 v0 = this.b;
			 v1 = this.a;
			 v1 = this.c;
			 (( com.doodlemobile.gamecenter.ay ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/ay;->b(Ljava/lang/String;)V
			 int v0 = 1; // const/4 v0, 0x1
			 /* new-array v0, v0, [Ljava/lang/String; */
			 final String v1 = "1.0"; // const-string v1, "1.0"
			 /* aput-object v1, v0, v5 */
			 (( com.doodlemobile.gamecenter.bd ) p0 ).publishProgress ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/bd;->publishProgress([Ljava/lang/Object;)V
			 v0 = this.b;
			 v0 = this.h;
			 final String v1 = "Remove Friend Success!"; // const-string v1, "Remove Friend Success!"
			 android.widget.Toast .makeText ( v0,v1,v5 );
			 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
		 } // :goto_0
		 return;
	 } // :cond_1
	 v0 = 	 (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
	 /* if-ne v0, v1, :cond_2 */
	 v0 = this.b;
	 v0 = this.h;
	 final String v1 = "Change User Profile Picture Failed(Not Available Network)"; // const-string v1, "Change User Profile Picture Failed(Not Available Network)"
	 android.widget.Toast .makeText ( v0,v1,v5 );
	 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :cond_2
v0 = this.b;
v0 = this.h;
final String v1 = "Change User Profile Picture Failed"; // const-string v1, "Change User Profile Picture Failed"
android.widget.Toast .makeText ( v0,v1,v5 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // .end method
public final void onPreExecute ( ) {
/* .locals 0 */
return;
} // .end method
protected final void onProgressUpdate ( java.lang.Object[] p0 ) { //bridge//synthethic
/* .locals 1 */
/* check-cast p1, [Ljava/lang/String; */
/* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V */
v0 = this.b;
com.doodlemobile.gamecenter.ay .a ( v0 );
v0 = this.b;
v0 = this.h;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.b;
	 v0 = this.h;
	 v0 = this.b;
	 (( com.doodlemobile.gamecenter.bz ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/bz;->c()V
} // :cond_0
return;
} // .end method
                                                                                                                                                                                                                                                                                                                                                                           	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 this.r = v0;
		 return;
	 } // .end method
	 static Integer a ( com.doodlemobile.gamecenter.ay p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/doodlemobile/gamecenter/ay;->x:I */
	 } // .end method
	 static java.util.concurrent.ExecutorService a ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.doodlemobile.gamecenter.ay.v;
	 } // .end method
	 static java.util.concurrent.ExecutorService a ( java.util.concurrent.ExecutorService p0 ) { //synthethic
		 /* .locals 0 */
	 } // .end method
	 static void a ( com.doodlemobile.gamecenter.ay p0 ) { //synthethic
		 /* .locals 7 */
		 /* const/16 v6, 0x8 */
		 int v5 = 0; // const/4 v5, 0x0
		 int v4 = 1; // const/4 v4, 0x1
		 final String v0 = "reset screen "; // const-string v0, "reset screen "
		 com.doodlemobile.gamecenter.e.b .a ( v0 );
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "reset screen size : "; // const-string v1, "reset screen size : "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v1 = this.n;
			 v1 = 			 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.doodlemobile.gamecenter.e.b .a ( v0 );
			 v0 = this.j;
			 v1 = this.c;
			 (( com.doodlemobile.gamecenter.b.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/doodlemobile/gamecenter/b/a;->a()Ljava/lang/String;
			 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 v0 = this.k;
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = ""; // const-string v2, ""
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.c;
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/gamecenter/b/a;->b()J
			 /* move-result-wide v2 */
			 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 v0 = this.l;
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "LV "; // const-string v2, "LV "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v2 = this.c;
			 (( com.doodlemobile.gamecenter.b.a ) v2 ).c ( ); // invoke-virtual {v2}, Lcom/doodlemobile/gamecenter/b/a;->c()J
			 /* move-result-wide v2 */
			 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 /* iput-boolean v4, p0, Lcom/doodlemobile/gamecenter/ay;->b:Z */
			 v0 = this.q;
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.widget.ListView ) v0 ).setAdapter ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
			 /* iget-boolean v0, p0, Lcom/doodlemobile/gamecenter/ay;->g:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.r;
				 (( android.widget.RelativeLayout ) v0 ).setVisibility ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V
				 v0 = this.p;
				 (( android.view.View ) v0 ).setVisibility ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V
				 v0 = this.e;
				 (( android.widget.Button ) v0 ).setEnabled ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Button;->setEnabled(Z)V
			 } // :goto_0
			 /* new-instance v0, Lcom/doodlemobile/gamecenter/i; */
			 v1 = this.h;
			 v2 = this.h;
			 com.doodlemobile.gamecenter.cm .a ( v2 );
			 v2 = this.a;
			 final String v3 = "layout"; // const-string v3, "layout"
			 final String v4 = "dm_moregame_listitem"; // const-string v4, "dm_moregame_listitem"
			 v2 = 			 com.doodlemobile.gamecenter.cd .a ( v2,v3,v4 );
			 v3 = this.n;
			 /* invoke-direct {v0, p0, v1, v2, v3}, Lcom/doodlemobile/gamecenter/i;-><init>(Lcom/doodlemobile/gamecenter/ay;Landroid/content/Context;ILjava/util/ArrayList;)V */
			 this.w = v0;
			 v0 = this.q;
			 v1 = this.w;
			 (( android.widget.ListView ) v0 ).setAdapter ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
			 v0 = this.c;
			 (( com.doodlemobile.gamecenter.b.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/b/a;->a()Ljava/lang/String;
			 (( com.doodlemobile.gamecenter.ay ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/ay;->c(Ljava/lang/String;)V
		 } // :cond_0
		 return;
	 } // :cond_1
	 v0 = this.r;
	 (( android.widget.RelativeLayout ) v0 ).setVisibility ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V
	 v0 = this.p;
	 (( android.view.View ) v0 ).setVisibility ( v6 ); // invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V
	 v0 = this.d;
	 (( android.widget.Button ) v0 ).setEnabled ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/Button;->setEnabled(Z)V
} // .end method
static void a ( com.doodlemobile.gamecenter.ay p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
	 /* .locals 6 */
	 final String v5 = "string"; // const-string v5, "string"
	 v0 = this.h;
	 (( com.doodlemobile.gamecenter.ay ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/ay;->getResources()Landroid/content/res/Resources;
	 v2 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v2 );
	 v2 = this.a;
	 final String v3 = "string"; // const-string v3, "string"
	 v2 = 	 com.doodlemobile.gamecenter.cd .a ( v2,v5,p1 );
	 (( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 (( com.doodlemobile.gamecenter.ay ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/ay;->getResources()Landroid/content/res/Resources;
	 v3 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v3 );
	 v3 = this.a;
	 final String v4 = "string"; // const-string v4, "string"
	 v3 = 	 com.doodlemobile.gamecenter.cd .a ( v3,v5,p2 );
	 (( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 android.app.ProgressDialog .show ( v0,v1,v2 );
	 this.t = v0;
	 return;
} // .end method
static android.app.ProgressDialog b ( com.doodlemobile.gamecenter.ay p0 ) { //synthethic
	 /* .locals 1 */
	 v0 = this.t;
} // .end method
static Integer c ( com.doodlemobile.gamecenter.ay p0 ) { //synthethic
	 /* .locals 1 */
	 /* iget v0, p0, Lcom/doodlemobile/gamecenter/ay;->x:I */
} // .end method
static com.doodlemobile.gamecenter.i d ( com.doodlemobile.gamecenter.ay p0 ) { //synthethic
	 /* .locals 1 */
	 v0 = this.w;
} // .end method
/* # virtual methods */
final java.lang.Integer a ( Object p0 ) {
	 /* .locals 7 */
	 final String v6 = " duration: "; // const-string v6, " duration: "
	 v0 = this.f;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.f;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Profile Activity network begin time: "; // const-string v2, "Profile Activity network begin time: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v2 = " duration: "; // const-string v2, " duration: "
		 (( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v2 */
		 (( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
		 /* move-result-wide v4 */
		 /* sub-long/2addr v2, v4 */
		 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.doodlemobile.gamecenter.e.b .a ( v0 );
	 } // :cond_0
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 java.lang.Long .valueOf ( v0,v1 );
	 this.f = v0;
	 v0 = 	 com.doodlemobile.gamecenter.f.b .a ( p1 );
	 /* if-eq v0, v1, :cond_2 */
	 /* if-ne v1, v0, :cond_1 */
	 java.lang.Integer .valueOf ( v0 );
} // :goto_0
} // :cond_1
java.lang.Integer .valueOf ( v0 );
} // :cond_2
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.f;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "UserInfo Activity network done time: "; // const-string v2, "UserInfo Activity network done time: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " duration: "; // const-string v2, " duration: "
(( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* sub-long/2addr v2, v4 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v0 );
} // :cond_3
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
this.f = v0;
java.lang.Integer .valueOf ( v0 );
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.a;
/* if-eq p1, v0, :cond_0 */
this.a = p1;
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/gamecenter/ay;->b:Z */
} // :cond_0
return;
} // .end method
public final void b ( ) {
/* .locals 0 */
return;
} // .end method
final void b ( java.lang.String p0 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
v1 = this.n;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "parseUserInfo user info: start: "; // const-string v2, "parseUserInfo user info: start: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v1 );
try { // :try_start_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
a.a.a.d .a ( v1 );
/* check-cast v1, La/a/a/c; */
final String v2 = "parseFriends query friends: friends-play-the-same-game"; // const-string v2, "parseFriends query friends: friends-play-the-same-game"
com.doodlemobile.gamecenter.e.b .a ( v2 );
final String v2 = "is-friend"; // const-string v2, "is-friend"
(( a.a.a.c ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Boolean; */
v2 = (( java.lang.Boolean ) v2 ).booleanValue ( ); // invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean v2, p0, Lcom/doodlemobile/gamecenter/ay;->g:Z */
final String v2 = "friends"; // const-string v2, "friends"
(( a.a.a.c ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
a.a.a.d .a ( v2 );
/* check-cast v2, La/a/a/b; */
final String v3 = "playedgame"; // const-string v3, "playedgame"
(( a.a.a.c ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
a.a.a.d .a ( v1 );
/* move-object v0, v1 */
/* check-cast v0, La/a/a/b; */
/* move-object v7, v0 */
/* new-instance v1, Lcom/doodlemobile/gamecenter/cp; */
/* invoke-direct {v1}, Lcom/doodlemobile/gamecenter/cp;-><init>()V */
int v3 = 2; // const/4 v3, 0x2
/* iput v3, v1, Lcom/doodlemobile/gamecenter/cp;->a:I */
v3 = this.n;
(( java.util.ArrayList ) v3 ).add ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "parseFriends query friends: friends_play_the_game "; // const-string v3, "parseFriends query friends: friends_play_the_game "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( a.a.a.b ) v2 ).size ( ); // invoke-virtual {v2}, La/a/a/b;->size()I
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v1 );
/* move v5, v9 */
} // :goto_0
v1 = (( a.a.a.b ) v2 ).size ( ); // invoke-virtual {v2}, La/a/a/b;->size()I
/* if-ge v5, v1, :cond_0 */
(( a.a.a.b ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, La/a/a/b;->get(I)Ljava/lang/Object;
/* check-cast v1, La/a/a/c; */
/* new-instance v6, Lcom/doodlemobile/gamecenter/cp; */
final String v3 = "friendid"; // const-string v3, "friendid"
(( a.a.a.c ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
final String v4 = "friendname"; // const-string v4, "friendname"
(( a.a.a.c ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
final String v8 = "friendhavavatar"; // const-string v8, "friendhavavatar"
(( a.a.a.c ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Boolean; */
/* invoke-direct {v6, v3, v4, v1}, Lcom/doodlemobile/gamecenter/cp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V */
v1 = this.n;
(( java.util.ArrayList ) v1 ).add ( v6 ); // invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v5, 0x1 */
/* move v5, v1 */
} // :cond_0
/* new-instance v1, Lcom/doodlemobile/gamecenter/cp; */
/* invoke-direct {v1}, Lcom/doodlemobile/gamecenter/cp;-><init>()V */
int v2 = 3; // const/4 v2, 0x3
/* iput v2, v1, Lcom/doodlemobile/gamecenter/cp;->a:I */
v2 = this.n;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "parseFriends query game: friends_play_the_game "; // const-string v2, "parseFriends query game: friends_play_the_game "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( a.a.a.b ) v7 ).size ( ); // invoke-virtual {v7}, La/a/a/b;->size()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v1 );
/* move v8, v9 */
} // :goto_1
v1 = (( a.a.a.b ) v7 ).size ( ); // invoke-virtual {v7}, La/a/a/b;->size()I
/* if-ge v8, v1, :cond_1 */
(( a.a.a.b ) v7 ).get ( v8 ); // invoke-virtual {v7, v8}, La/a/a/b;->get(I)Ljava/lang/Object;
/* move-object v0, v1 */
/* check-cast v0, La/a/a/c; */
/* move-object v6, v0 */
/* new-instance v1, Lcom/doodlemobile/gamecenter/cp; */
final String v2 = "appid"; // const-string v2, "appid"
(( a.a.a.c ) v6 ).get ( v2 ); // invoke-virtual {v6, v2}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
final String v3 = "gamename"; // const-string v3, "gamename"
(( a.a.a.c ) v6 ).get ( v3 ); // invoke-virtual {v6, v3}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
final String v4 = "companyname"; // const-string v4, "companyname"
(( a.a.a.c ) v6 ).get ( v4 ); // invoke-virtual {v6, v4}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
final String v5 = "marketuri"; // const-string v5, "marketuri"
(( a.a.a.c ) v6 ).get ( v5 ); // invoke-virtual {v6, v5}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v5, Ljava/lang/String; */
final String v9 = "imageuri"; // const-string v9, "imageuri"
(( a.a.a.c ) v6 ).get ( v9 ); // invoke-virtual {v6, v9}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v6, Ljava/lang/String; */
/* invoke-direct/range {v1 ..v6}, Lcom/doodlemobile/gamecenter/cp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
v2 = this.n;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* add-int/lit8 v1, v8, 0x1 */
/* move v8, v1 */
/* :catch_0 */
/* move-exception v1 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_1
return;
} // .end method
