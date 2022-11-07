public class com.doodlemobile.gamecenter.FeatureView extends android.widget.RelativeLayout {
	 /* # static fields */
	 private static java.lang.String x;
	 /* # instance fields */
	 public java.lang.String a;
	 private android.os.Handler b;
	 private java.lang.String c;
	 private android.graphics.Bitmap d;
	 private com.doodlemobile.gamecenter.d.c e;
	 private android.view.View f;
	 private android.widget.ImageView g;
	 private android.widget.TextView h;
	 private android.content.Context i;
	 private android.widget.TextView j;
	 private android.content.Intent k;
	 private android.widget.RelativeLayout l;
	 private java.lang.String m;
	 private java.lang.String n;
	 private Integer o;
	 private final Integer p;
	 private final Integer q;
	 private final Integer r;
	 private Integer s;
	 private final Integer t;
	 private final java.lang.String u;
	 private final java.lang.String v;
	 private final java.lang.String w;
	 /* # direct methods */
	 static com.doodlemobile.gamecenter.FeatureView ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public com.doodlemobile.gamecenter.FeatureView ( ) {
		 /* .locals 7 */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v6 = "feature_companyname"; // const-string v6, "feature_companyname"
		 final String v2 = "dm.featureView.location"; // const-string v2, "dm.featureView.location"
		 final String v5 = "layout"; // const-string v5, "layout"
		 final String v4 = "id"; // const-string v4, "id"
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/g; */
		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/g;-><init>(Lcom/doodlemobile/gamecenter/FeatureView;)V */
		 this.b = v0;
		 this.a = v1;
		 final String v0 = "FeatureView"; // const-string v0, "FeatureView"
		 this.c = v0;
		 this.d = v1;
		 this.e = v1;
		 this.f = v1;
		 this.g = v1;
		 this.h = v1;
		 this.i = v1;
		 this.j = v1;
		 this.k = v1;
		 this.l = v1;
		 this.m = v1;
		 this.n = v1;
		 /* const/16 v0, 0xa */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
		 /* const/16 v0, 0x46 */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->p:I */
		 /* const/16 v0, 0x1e */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->q:I */
		 /* const/16 v0, 0x3c */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->r:I */
		 /* const/16 v0, 0x2711 */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
		 /* const/16 v0, 0x3e8 */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->t:I */
		 final String v0 = "icon"; // const-string v0, "icon"
		 this.u = v0;
		 final String v0 = "promotedialog"; // const-string v0, "promotedialog"
		 this.v = v0;
		 final String v0 = "default"; // const-string v0, "default"
		 this.w = v0;
		 this.i = p1;
		 final String v0 = "dm.featureView.location"; // const-string v0, "dm.featureView.location"
		 final String v0 = "featureLocation"; // const-string v0, "featureLocation"
		 this.a = v0;
		 final String v0 = "dm.featureView.location"; // const-string v0, "dm.featureView.location"
		 final String v0 = "type"; // const-string v0, "type"
		 this.m = v0;
		 final String v0 = "dm.featureView.location"; // const-string v0, "dm.featureView.location"
		 final String v0 = "xmlname"; // const-string v0, "xmlname"
		 this.n = v0;
		 v1 = this.n;
		 v0 = this.i;
		 final String v2 = "layout_inflater"; // const-string v2, "layout_inflater"
		 (( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/view/LayoutInflater; */
		 v2 = this.m;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 v2 = this.m;
			 final String v3 = "default"; // const-string v3, "default"
			 v2 = 			 (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v2 != null) { // if-eqz v2, :cond_2
			 } // :cond_0
			 /* const/16 v2, 0x1e */
			 /* iput v2, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
			 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
			 com.doodlemobile.gamecenter.cm .a ( v2 );
			 v2 = this.a;
			 final String v3 = "layout"; // const-string v3, "layout"
			 v1 = 			 com.doodlemobile.gamecenter.cd .a ( v2,v5,v1 );
			 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/RelativeLayout; */
			 this.f = v0;
			 v0 = this.f;
			 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
			 com.doodlemobile.gamecenter.cm .a ( v1 );
			 v1 = this.a;
			 final String v2 = "id"; // const-string v2, "id"
			 final String v2 = "featurebar"; // const-string v2, "featurebar"
			 v1 = 			 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
			 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/RelativeLayout; */
			 this.l = v0;
			 v0 = this.f;
			 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
			 com.doodlemobile.gamecenter.cm .a ( v1 );
			 v1 = this.a;
			 final String v2 = "id"; // const-string v2, "id"
			 final String v2 = "feature_gamename"; // const-string v2, "feature_gamename"
			 v1 = 			 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
			 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 this.h = v0;
			 v0 = this.f;
			 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
			 com.doodlemobile.gamecenter.cm .a ( v1 );
			 v1 = this.a;
			 final String v2 = "id"; // const-string v2, "id"
			 final String v2 = "feature_companyname"; // const-string v2, "feature_companyname"
			 v1 = 			 com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
			 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
			 /* check-cast v0, Landroid/widget/TextView; */
			 this.j = v0;
			 v0 = this.l;
			 /* new-instance v1, Lcom/doodlemobile/gamecenter/b; */
			 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/b;-><init>(Lcom/doodlemobile/gamecenter/FeatureView;)V */
			 (( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 } // :cond_1
	 } // :goto_0
	 v0 = this.f;
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "id"; // const-string v2, "id"
	 final String v2 = "feature_image"; // const-string v2, "feature_image"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
	 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/ImageView; */
	 this.g = v0;
	 v0 = this.f;
	 this.f = v0;
	 v0 = this.f;
	 /* const/16 v1, 0x8 */
	 (( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
	 com.doodlemobile.gamecenter.d.d .a ( p0 );
	 v0 = this.b;
	 /* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
	 (( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->a()V
	 return;
} // :cond_2
v2 = this.m;
final String v3 = "icon"; // const-string v3, "icon"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v2 );
	 v2 = this.a;
	 final String v3 = "layout"; // const-string v3, "layout"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v2,v5,v1 );
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/RelativeLayout; */
	 this.f = v0;
	 v0 = this.f;
	 /* new-instance v1, Lcom/doodlemobile/gamecenter/c; */
	 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/c;-><init>(Lcom/doodlemobile/gamecenter/FeatureView;)V */
	 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // :cond_3
v2 = this.m;
final String v3 = "promotedialog"; // const-string v3, "promotedialog"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v2 );
	 v2 = this.a;
	 final String v3 = "layout"; // const-string v3, "layout"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v2,v5,v1 );
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/RelativeLayout; */
	 this.f = v0;
	 v0 = this.f;
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "id"; // const-string v2, "id"
	 final String v2 = "feature_gamename"; // const-string v2, "feature_gamename"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
	 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 this.h = v0;
	 v0 = this.f;
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "id"; // const-string v2, "id"
	 final String v2 = "feature_companyname"; // const-string v2, "feature_companyname"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
	 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 this.j = v0;
	 /* const/16 v0, 0x46 */
	 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
	 /* goto/16 :goto_0 */
} // :cond_4
v2 = this.m;
if ( v2 != null) { // if-eqz v2, :cond_1
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v2 );
	 v2 = this.a;
	 final String v3 = "layout"; // const-string v3, "layout"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v2,v5,v1 );
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/RelativeLayout; */
	 this.f = v0;
	 v0 = this.f;
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "id"; // const-string v2, "id"
	 final String v2 = "feature_gamename"; // const-string v2, "feature_gamename"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v2 );
	 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 this.h = v0;
	 v0 = this.f;
	 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getContext()Landroid/content/Context;
	 com.doodlemobile.gamecenter.cm .a ( v1 );
	 v1 = this.a;
	 final String v2 = "id"; // const-string v2, "id"
	 final String v2 = "feature_companyname"; // const-string v2, "feature_companyname"
	 v1 = 	 com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
	 (( android.view.View ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
	 /* check-cast v0, Landroid/widget/TextView; */
	 this.j = v0;
	 /* const/16 v0, 0x3c */
	 /* iput v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
	 v0 = this.f;
	 /* new-instance v1, Lcom/doodlemobile/gamecenter/f; */
	 /* invoke-direct {v1, p0}, Lcom/doodlemobile/gamecenter/f;-><init>(Lcom/doodlemobile/gamecenter/FeatureView;)V */
	 (( android.view.View ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* goto/16 :goto_0 */
} // .end method
static android.content.Intent a ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
	 /* .locals 1 */
	 v0 = this.k;
} // .end method
private Boolean a ( Object p0 ) {
	 /* .locals 4 */
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "icon"; // const-string v3, "icon"
	 if ( p1 != null) { // if-eqz p1, :cond_4
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = this.a;
			 v1 = this.a;
			 /* array-length v1, v1 */
			 android.graphics.BitmapFactory .decodeByteArray ( v0,v2,v1 );
			 this.d = v0;
			 v0 = this.d;
			 /* if-nez v0, :cond_0 */
			 v0 = this.b;
			 v1 = this.i;
			 com.doodlemobile.gamecenter.d.d .a ( v0,v1 );
			 /* move v0, v2 */
		 } // :goto_0
	 } // :cond_0
	 v0 = this.g;
	 v1 = this.d;
	 (( android.widget.ImageView ) v0 ).setImageBitmap ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
	 v0 = this.m;
	 final String v1 = "icon"; // const-string v1, "icon"
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v0, :cond_1 */
	 v0 = this.h;
	 v1 = this.d;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 v0 = this.j;
	 v1 = this.c;
	 (( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_1
} // :goto_1
(( com.doodlemobile.gamecenter.FeatureView ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->b()Landroid/content/Intent;
this.k = v0;
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
this.a = v0;
v0 = this.b;
com.doodlemobile.gamecenter.f.a .a ( v0 );
this.a = v0;
v0 = this.a;
/* if-nez v0, :cond_3 */
/* move v0, v2 */
} // :cond_3
v0 = this.a;
v1 = this.a;
/* array-length v1, v1 */
android.graphics.BitmapFactory .decodeByteArray ( v0,v2,v1 );
this.d = v0;
v0 = this.g;
v1 = this.d;
(( android.widget.ImageView ) v0 ).setImageBitmap ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
v0 = this.m;
final String v1 = "icon"; // const-string v1, "icon"
/* if-eq v0, v3, :cond_1 */
v0 = this.h;
v1 = this.d;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.j;
v1 = this.d;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
} // :cond_4
/* move v0, v2 */
} // .end method
static com.doodlemobile.gamecenter.d.c b ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
static java.lang.String c ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
/* .locals 1 */
v0 = this.c;
} // .end method
static android.content.Context d ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
/* .locals 1 */
v0 = this.i;
} // .end method
static android.view.View e ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
/* .locals 1 */
v0 = this.f;
} // .end method
static void f ( com.doodlemobile.gamecenter.FeatureView p0 ) { //synthethic
/* .locals 4 */
/* const/16 v3, 0x46 */
v0 = this.f;
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* if-nez v0, :cond_1 */
v0 = this.f;
v0 = (( android.view.View ) v0 ).isShown ( ); // invoke-virtual {v0}, Landroid/view/View;->isShown()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* if-ne v0, v3, :cond_0 */
com.doodlemobile.gamecenter.d.d .a ( );
} // :cond_0
v0 = this.i;
com.doodlemobile.gamecenter.d.d .a ( v0 );
this.e = v0;
v0 = this.e;
v0 = /* invoke-direct {p0, v0}, Lcom/doodlemobile/gamecenter/FeatureView;->a(Lcom/doodlemobile/gamecenter/d/c;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
try { // :try_start_0
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
v0 = this.e;
v0 = this.d;
final String v1 = "Refresh"; // const-string v1, "Refresh"
v2 = this.a;
com.doodlemobile.gamecenter.z .a ( v0,v1,v2 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.e;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " refresh "; // const-string v1, " refresh "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .d ( v0 );
v0 = this.c;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "refresh"; // const-string v2, "refresh"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
} // :cond_1
} // :goto_0
try { // :try_start_1
/* iget v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* if-eq v0, v3, :cond_2 */
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
/* iget v2, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* mul-int/lit16 v2, v2, 0x3e8 */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).sendEmptyMessageDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_2
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* :catch_1 */
/* move-exception v0 */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 4 */
/* const/16 v3, 0x8 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.i;
v0 = com.doodlemobile.gamecenter.d.d .c ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* const/16 v1, 0x46 */
/* if-ne v0, v1, :cond_0 */
com.doodlemobile.gamecenter.d.d .a ( );
} // :cond_0
v0 = this.i;
com.doodlemobile.gamecenter.d.d .a ( v0 );
this.e = v0;
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.e;
v0 = /* invoke-direct {p0, v0}, Lcom/doodlemobile/gamecenter/FeatureView;->a(Lcom/doodlemobile/gamecenter/d/c;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( com.doodlemobile.gamecenter.FeatureView ) p0 ).getWindowVisibility ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->getWindowVisibility()I
/* if-nez v0, :cond_1 */
v0 = this.g;
(( android.widget.ImageView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
v0 = this.f;
(( android.view.View ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.f;
(( android.view.View ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
} // :cond_3
v0 = this.f;
(( android.view.View ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
} // .end method
public final android.content.Intent b ( ) {
/* .locals 2 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
v1 = this.e;
v1 = this.e;
android.net.Uri .parse ( v1 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
} // .end method
public final com.doodlemobile.gamecenter.d.c c ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
protected void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V */
v0 = (( com.doodlemobile.gamecenter.FeatureView ) p0 ).isShown ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->isShown()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.doodlemobile.gamecenter.FeatureView.x;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.doodlemobile.gamecenter.FeatureView.x;
v1 = this.a;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
} // :cond_0
try { // :try_start_0
v0 = this.e;
v0 = this.d;
final String v1 = "Appear"; // const-string v1, "Appear"
v2 = this.a;
com.doodlemobile.gamecenter.z .a ( v0,v1,v2 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.e;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " appear "; // const-string v1, " appear "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .d ( v0 );
v0 = this.c;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "appear "; // const-string v2, "appear "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " mAppear is "; // const-string v2, " mAppear is "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = com.doodlemobile.gamecenter.FeatureView.x;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
v0 = this.a;
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
/* iget v2, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* mul-int/lit16 v2, v2, 0x3e8 */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).sendEmptyMessageDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
} // :cond_1
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowVisibilityChanged(I)V */
/* const/16 v0, 0x8 */
/* if-ne p1, v0, :cond_1 */
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
int v0 = 1; // const/4 v0, 0x1
com.doodlemobile.gamecenter.d.d.a = (v0!= 0);
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* if-nez p1, :cond_0 */
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
(( com.doodlemobile.gamecenter.FeatureView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->a()V
v0 = this.f;
v0 = (( android.view.View ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
/* if-nez v0, :cond_0 */
v0 = (( com.doodlemobile.gamecenter.FeatureView ) p0 ).isShown ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->isShown()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
final String v1 = "onWindowVisbilityChanged"; // const-string v1, "onWindowVisbilityChanged"
android.util.Log .i ( v0,v1 );
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
(( android.os.Handler ) v0 ).removeMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/gamecenter/FeatureView;->s:I */
/* iget v2, p0, Lcom/doodlemobile/gamecenter/FeatureView;->o:I */
/* mul-int/lit16 v2, v2, 0x3e8 */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).sendEmptyMessageDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
} // .end method
