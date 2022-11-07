public class inal extends com.doodlemobile.gamecenter.ca {
	 /* # instance fields */
	 android.graphics.Bitmap a;
	 android.graphics.Bitmap b;
	 android.widget.ImageView c;
	 public com.doodlemobile.gamecenter.facebook.LoginLayout d;
	 android.os.Handler e;
	 com.doodlemobile.gamecenter.bp f;
	 com.doodlemobile.gamecenter.ba g;
	 private java.lang.Long i;
	 private com.doodlemobile.gamecenter.l j;
	 private com.doodlemobile.gamecenter.m k;
	 private android.widget.TextView l;
	 private android.widget.TextView m;
	 private android.widget.RelativeLayout n;
	 private android.widget.RelativeLayout o;
	 private android.widget.RelativeLayout p;
	 private android.widget.TextView q;
	 private android.widget.TextView r;
	 private android.widget.ProgressBar s;
	 private android.widget.RelativeLayout t;
	 private com.doodlemobile.gamecenter.ac u;
	 private com.doodlemobile.gamecenter.h v;
	 private com.doodlemobile.gamecenter.da w;
	 private android.app.ProgressDialog x;
	 private Boolean y;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 final String v4 = "id"; // const-string v4, "id"
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/gamecenter/ca;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
		 this.i = v1;
		 this.j = v1;
		 this.k = v1;
		 this.a = v1;
		 this.b = v1;
		 this.c = v1;
		 this.l = v1;
		 this.m = v1;
		 this.n = v1;
		 this.o = v1;
		 this.p = v1;
		 this.q = v1;
		 this.r = v1;
		 this.s = v1;
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/ac; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/ac;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 this.u = v0;
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/p; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/p;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 this.e = v0;
		 this.v = v1;
		 this.w = v1;
		 this.f = v1;
		 this.g = v1;
		 /* iput-boolean v5, p0, Lcom/doodlemobile/gamecenter/y;->y:Z */
		 this.h = p1;
		 final String v0 = "layout_inflater"; // const-string v0, "layout_inflater"
		 (( com.doodlemobile.gamecenter.GameCenterActivity ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/LayoutInflater; */
		 (( com.doodlemobile.gamecenter.y ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/y;->getContext()Landroid/content/Context;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "layout"; // const-string v2, "layout"
		 final String v3 = "dm_profile_view"; // const-string v3, "dm_profile_view"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
		 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 this.t = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "username_text"; // const-string v2, "username_text"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.l = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "change_username"; // const-string v2, "change_username"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 this.n = v0;
		 v0 = this.n;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/s; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/s;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 (( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "facebook_friend"; // const-string v2, "facebook_friend"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Lcom/doodlemobile/gamecenter/facebook/LoginLayout; */
		 this.d = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "change_usericon"; // const-string v2, "change_usericon"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 this.o = v0;
		 v0 = this.o;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/t; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/t;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 (( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "my_headimage"; // const-string v2, "my_headimage"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/ImageView; */
		 this.c = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "change_username_desc"; // const-string v2, "change_username_desc"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.m = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "about_dm"; // const-string v2, "about_dm"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/RelativeLayout; */
		 this.p = v0;
		 v0 = this.p;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/u; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/u;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 (( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "level_text"; // const-string v2, "level_text"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.q = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "xp_text"; // const-string v2, "xp_text"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/TextView; */
		 this.r = v0;
		 v0 = this.t;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 final String v2 = "level_progressbar"; // const-string v2, "level_progressbar"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
		 (( android.widget.RelativeLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/ProgressBar; */
		 this.s = v0;
		 v0 = this.h;
		 /* new-instance v1, Lcom/a/a/k; */
		 v2 = this.h;
		 v2 = this.d;
		 /* invoke-direct {v1, v2}, Lcom/a/a/k;-><init>(Lcom/a/a/g;)V */
		 this.e = v1;
		 v0 = this.h;
		 v0 = this.d;
		 v1 = this.h;
		 (( com.doodlemobile.gamecenter.GameCenterActivity ) v1 ).getApplicationContext ( ); // invoke-virtual {v1}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getApplicationContext()Landroid/content/Context;
		 com.doodlemobile.gamecenter.facebook.f .b ( v0,v1 );
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/cu; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/cu;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 com.doodlemobile.gamecenter.facebook.e .a ( v0 );
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/ce; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/ce;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 com.doodlemobile.gamecenter.facebook.e .a ( v0 );
		 v0 = this.u;
		 com.doodlemobile.gamecenter.facebook.e .a ( v0 );
		 v0 = this.u;
		 com.doodlemobile.gamecenter.facebook.e .a ( v0 );
		 v0 = this.d;
		 /* new-instance v1, Lcom/doodlemobile/gamecenter/o; */
		 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/o;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
		 (( com.doodlemobile.gamecenter.facebook.LoginLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/facebook/LoginLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/y;->h()V */
		 v0 = 		 com.doodlemobile.gamecenter.b.b .b ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "dm_first_open_title"; // const-string v0, "dm_first_open_title"
			 final String v1 = "dm_first_open_text"; // const-string v1, "dm_first_open_text"
			 /* invoke-direct {p0, v0, v1}, Lcom/doodlemobile/gamecenter/y;->a(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v0, Lcom/doodlemobile/gamecenter/m; */
			 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/m;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
			 this.k = v0;
			 v0 = this.k;
			 /* new-array v1, v5, [Ljava/lang/Integer; */
			 (( com.doodlemobile.gamecenter.m ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/m;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
		 } // :goto_0
		 v0 = this.h;
		 v1 = this.h;
		 com.doodlemobile.gamecenter.cm .a ( v1 );
		 v1 = this.a;
		 final String v2 = "string"; // const-string v2, "string"
		 final String v3 = "dm_profileIconLabel"; // const-string v3, "dm_profileIconLabel"
		 v1 = 		 com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
		 (( com.doodlemobile.gamecenter.GameCenterActivity ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getString(I)Ljava/lang/String;
		 (( com.doodlemobile.gamecenter.y ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/y;->c(Ljava/lang/String;)V
		 return;
	 } // :cond_0
	 /* new-instance v0, Lcom/doodlemobile/gamecenter/l; */
	 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/l;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
	 this.j = v0;
	 v0 = this.j;
	 /* new-array v1, v5, [Ljava/lang/Integer; */
	 (( com.doodlemobile.gamecenter.l ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/l;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
} // .end method
static void a ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/y;->h()V */
	 return;
} // .end method
static void a ( Object p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
	 /* .locals 0 */
	 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/gamecenter/y;->a(Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
private void a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 6 */
	 final String v5 = "string"; // const-string v5, "string"
	 v0 = this.h;
	 (( com.doodlemobile.gamecenter.y ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/y;->getResources()Landroid/content/res/Resources;
	 v2 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v2 );
	 v2 = this.a;
	 final String v3 = "string"; // const-string v3, "string"
	 v2 = 	 com.doodlemobile.gamecenter.cd .a ( v2,v5,p1 );
	 (( android.content.res.Resources ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 (( com.doodlemobile.gamecenter.y ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/y;->getResources()Landroid/content/res/Resources;
	 v3 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v3 );
	 v3 = this.a;
	 final String v4 = "string"; // const-string v4, "string"
	 v3 = 	 com.doodlemobile.gamecenter.cd .a ( v3,v5,p2 );
	 (( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 android.app.ProgressDialog .show ( v0,v1,v2 );
	 this.x = v0;
	 return;
} // .end method
static android.app.ProgressDialog b ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 v0 = this.x;
} // .end method
private void h ( ) {
	 /* .locals 5 */
	 final String v4 = "string"; // const-string v4, "string"
	 final String v3 = "dm_username"; // const-string v3, "dm_username"
	 v0 = this.x;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.x;
		 v0 = 		 (( android.app.ProgressDialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.x;
			 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
		 } // :cond_0
		 com.doodlemobile.gamecenter.b.b .f ( );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 com.doodlemobile.gamecenter.b.b .g ( );
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = this.l;
				 com.doodlemobile.gamecenter.b.b .g ( );
				 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
				 v0 = this.m;
				 com.doodlemobile.gamecenter.b.b .g ( );
				 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
			 } // :goto_0
			 /* new-instance v0, Lcom/doodlemobile/gamecenter/cq; */
			 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/cq;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
			 int v1 = 0; // const/4 v1, 0x0
			 /* new-array v1, v1, [Ljava/lang/String; */
			 (( com.doodlemobile.gamecenter.cq ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/cq;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
		 } // :cond_1
		 /* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/y;->i()V */
		 return;
	 } // :cond_2
	 v0 = this.l;
	 v1 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "string"; // const-string v2, "string"
	 final String v2 = "dm_username"; // const-string v2, "dm_username"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v3 );
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
	 v0 = this.m;
	 v1 = this.h;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "string"; // const-string v2, "string"
	 final String v2 = "dm_username"; // const-string v2, "dm_username"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v3 );
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V
} // .end method
private void i ( ) {
	 /* .locals 5 */
	 int v4 = 0; // const/4 v4, 0x0
	 v0 = this.q;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "LV "; // const-string v2, "LV "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 com.doodlemobile.gamecenter.b.b .l ( );
	 /* move-result-wide v2 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 v0 = this.r;
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 com.doodlemobile.gamecenter.b.b .m ( );
	 /* move-result-wide v2 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 final String v2 = " / "; // const-string v2, " / "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 com.doodlemobile.gamecenter.b.b .n ( );
	 /* move-result-wide v2 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 v0 = this.s;
	 /* const/16 v1, 0x64 */
	 (( android.widget.ProgressBar ) v0 ).setMax ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V
	 com.doodlemobile.gamecenter.b.b .n ( );
	 /* move-result-wide v0 */
	 /* const-wide/16 v2, 0x0 */
	 /* cmp-long v0, v0, v2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.s;
		 com.doodlemobile.gamecenter.b.b .m ( );
		 /* move-result-wide v1 */
		 /* long-to-float v1, v1 */
		 com.doodlemobile.gamecenter.b.b .n ( );
		 /* move-result-wide v2 */
		 /* long-to-float v2, v2 */
		 /* div-float/2addr v1, v2 */
		 /* const/high16 v2, 0x42c80000 # 100.0f */
		 /* mul-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 (( android.widget.ProgressBar ) v0 ).setProgress ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V
	 } // :goto_0
	 v0 = this.h;
	 v0 = this.d;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 v0 = this.h;
		 v0 = this.d;
		 v0 = 		 (( com.a.a.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/a/g;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 com.doodlemobile.gamecenter.b.b .k ( );
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.d;
				 /* const/16 v1, 0x8 */
				 (( com.doodlemobile.gamecenter.facebook.LoginLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/facebook/LoginLayout;->setVisibility(I)V
			 } // :goto_1
			 return;
		 } // :cond_0
		 v0 = this.s;
		 (( android.widget.ProgressBar ) v0 ).setProgress ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setProgress(I)V
	 } // :cond_1
	 v0 = this.d;
	 (( com.doodlemobile.gamecenter.facebook.LoginLayout ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/gamecenter/facebook/LoginLayout;->setVisibility(I)V
} // :cond_2
v0 = this.d;
(( com.doodlemobile.gamecenter.facebook.LoginLayout ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/gamecenter/facebook/LoginLayout;->setVisibility(I)V
} // .end method
/* # virtual methods */
final Integer a ( Object p0 ) {
/* .locals 7 */
final String v6 = " duration: "; // const-string v6, " duration: "
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.i;
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
this.i = v0;
v0 = com.doodlemobile.gamecenter.f.b .a ( p1 );
/* if-eq v0, v1, :cond_2 */
/* if-ne v1, v0, :cond_1 */
} // :goto_0
} // :cond_1
} // :cond_2
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.i;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Profile Activity network done time: "; // const-string v2, "Profile Activity network done time: "
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
this.i = v0;
} // .end method
public final void a ( ) {
/* .locals 4 */
/* invoke-direct {p0}, Lcom/doodlemobile/gamecenter/y;->i()V */
v0 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "string"; // const-string v2, "string"
final String v3 = "dm_profileIconLabel"; // const-string v3, "dm_profileIconLabel"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getString(I)Ljava/lang/String;
(( com.doodlemobile.gamecenter.y ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/y;->c(Ljava/lang/String;)V
(( com.doodlemobile.gamecenter.ca ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/ca;->b()V
return;
} // .end method
public final void a ( android.content.Intent p0 ) {
/* .locals 4 */
final String v0 = "uri"; // const-string v0, "uri"
(( android.content.Intent ) p1 ).getParcelableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
final String v0 = "data"; // const-string v0, "data"
(( android.content.Intent ) p1 ).getParcelableExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v0, Landroid/graphics/Bitmap; */
this.b = v0;
v0 = this.b;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v1 = this.b;
v1 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x4 */
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
v0 = this.b;
v2 = android.graphics.Bitmap$CompressFormat.PNG;
/* const/16 v3, 0x64 */
(( android.graphics.Bitmap ) v0 ).compress ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
final String v1 = "dm_change_headicon_title"; // const-string v1, "dm_change_headicon_title"
final String v2 = "dm_change_headicon_text"; // const-string v2, "dm_change_headicon_text"
/* invoke-direct {p0, v1, v2}, Lcom/doodlemobile/gamecenter/y;->a(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v1, Lcom/doodlemobile/gamecenter/da; */
/* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/da;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
this.w = v1;
v1 = this.w;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [[B */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v0, v2, v3 */
(( com.doodlemobile.gamecenter.da ) v1 ).execute ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/gamecenter/da;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = this.h;
final String v1 = "Change Username failed: input is null"; // const-string v1, "Change Username failed: input is null"
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :goto_0
return;
} // :cond_1
final String v0 = "dm_change_username_title"; // const-string v0, "dm_change_username_title"
final String v1 = "dm_change_username_text"; // const-string v1, "dm_change_username_text"
/* invoke-direct {p0, v0, v1}, Lcom/doodlemobile/gamecenter/y;->a(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v0, Lcom/doodlemobile/gamecenter/h; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/h;-><init>(Lcom/doodlemobile/gamecenter/y;)V */
this.v = v0;
v0 = this.v;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/String; */
/* aput-object p1, v1, v2 */
(( com.doodlemobile.gamecenter.h ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/h;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
} // .end method
public final void b ( ) {
/* .locals 0 */
return;
} // .end method
public final android.app.Dialog c ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/doodlemobile/gamecenter/cr; */
v1 = this.h;
com.doodlemobile.gamecenter.b.b .g ( );
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/gamecenter/cr;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
} // .end method
public final android.app.Dialog d ( ) {
/* .locals 3 */
v0 = this.h;
/* new-instance v1, Landroid/view/ContextThemeWrapper; */
/* const v2, 0x103000c */
/* invoke-direct {v1, v0, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/gamecenter/y;->y:Z */
/* new-instance v0, Lcom/doodlemobile/gamecenter/cv; */
v1 = this.h;
/* invoke-direct {v0, v1}, Lcom/doodlemobile/gamecenter/cv;-><init>(Landroid/content/Context;)V */
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/doodlemobile/gamecenter/bh; */
v1 = this.h;
/* invoke-direct {v0, v1}, Lcom/doodlemobile/gamecenter/bh;-><init>(Landroid/content/Context;)V */
} // .end method
public final void e ( ) {
/* .locals 4 */
try { // :try_start_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.media.action.IMAGE_CAPTURE"; // const-string v1, "android.media.action.IMAGE_CAPTURE"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
v1 = this.h;
/* const/16 v2, 0x2714 */
(( com.doodlemobile.gamecenter.GameCenterActivity ) v1 ).startActivityForResult ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
v0 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "string"; // const-string v2, "string"
final String v3 = "dm_noIntentHandleCamera"; // const-string v3, "dm_noIntentHandleCamera"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
int v2 = 0; // const/4 v2, 0x0
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // .end method
public final void f ( ) {
/* .locals 4 */
try { // :try_start_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.GET_CONTENT"; // const-string v1, "android.intent.action.GET_CONTENT"
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
final String v1 = "image/*"; // const-string v1, "image/*"
(( android.content.Intent ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "crop"; // const-string v1, "crop"
final String v2 = "true"; // const-string v2, "true"
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "aspectX"; // const-string v1, "aspectX"
int v2 = 1; // const/4 v2, 0x1
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "aspectY"; // const-string v1, "aspectY"
int v2 = 1; // const/4 v2, 0x1
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "outputX"; // const-string v1, "outputX"
/* const/16 v2, 0x48 */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "outputY"; // const-string v1, "outputY"
/* const/16 v2, 0x48 */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "return-data"; // const-string v1, "return-data"
int v2 = 1; // const/4 v2, 0x1
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
v1 = this.h;
/* const/16 v2, 0x2713 */
(( com.doodlemobile.gamecenter.GameCenterActivity ) v1 ).startActivityForResult ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->startActivityForResult(Landroid/content/Intent;I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
v0 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "string"; // const-string v2, "string"
final String v3 = "dm_noIntentHandleGallery"; // const-string v3, "dm_noIntentHandleGallery"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
int v2 = 0; // const/4 v2, 0x0
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // .end method
public final void g ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/doodlemobile/gamecenter/cv; */
v1 = this.h;
/* invoke-direct {v0, v1}, Lcom/doodlemobile/gamecenter/cv;-><init>(Landroid/content/Context;)V */
(( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
return;
} // .end method
