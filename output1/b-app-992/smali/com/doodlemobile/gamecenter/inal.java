public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = ".R$"; // const-string v1, ".R$"
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 java.lang.Class .forName ( v0 );
			 (( java.lang.Class ) v0 ).getField ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 (( java.lang.reflect.Field ) v1 ).getInt ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 Lcom/doodlemobile/gamecenter/b/a/a; */
final String v3 = "user-name"; // const-string v3, "user-name"
(( a.a.a.c ) v10 ).get ( v3 ); // invoke-virtual {v10, v3}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
final String v4 = "user-id"; // const-string v4, "user-id"
(( a.a.a.c ) v10 ).get ( v4 ); // invoke-virtual {v10, v4}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
final String v6 = "score"; // const-string v6, "score"
(( a.a.a.c ) v10 ).get ( v6 ); // invoke-virtual {v10, v6}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v6, Ljava/lang/Long; */
(( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
/* move-result-wide v6 */
final String v8 = "rank"; // const-string v8, "rank"
(( a.a.a.c ) v10 ).get ( v8 ); // invoke-virtual {v10, v8}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v8, Ljava/lang/Long; */
(( java.lang.Long ) v8 ).longValue ( ); // invoke-virtual {v8}, Ljava/lang/Long;->longValue()J
/* move-result-wide v8 */
final String v14 = "hasavatar"; // const-string v14, "hasavatar"
(( a.a.a.c ) v10 ).get ( v14 ); // invoke-virtual {v10, v14}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v10, Ljava/lang/Boolean; */
v10 = (( java.lang.Boolean ) v10 ).booleanValue ( ); // invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z
/* invoke-direct/range {v2 ..v10}, Lcom/doodlemobile/gamecenter/b/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V */
(( java.util.ArrayList ) v13 ).add ( v2 ); // invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v2, v12, 0x1 */
/* move v12, v2 */
} // :cond_4
/* move-object/from16 v0, p0 */
v0 = this.r;
/* move-object v2, v0 */
(( java.util.ArrayList ) v2 ).clear ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
} // :cond_5
return;
} // :cond_6
/* move-object v5, v2 */
} // :cond_7
/* move-object v5, v2 */
/* goto/16 :goto_2 */
} // .end method
static com.doodlemobile.gamecenter.ct b ( com.doodlemobile.gamecenter.aa p0 ) { //synthethic
/* .locals 1 */
v0 = this.e;
} // .end method
static java.lang.Integer b ( com.doodlemobile.gamecenter.aa p0, java.lang.Integer p1 ) { //synthethic
/* .locals 0 */
this.g = p1;
} // .end method
static com.doodlemobile.gamecenter.ct c ( com.doodlemobile.gamecenter.aa p0 ) { //synthethic
/* .locals 1 */
v0 = this.f;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 4 */
v0 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "string"; // const-string v2, "string"
final String v3 = "dm_leaderboardIconLabel"; // const-string v3, "dm_leaderboardIconLabel"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v2,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getString(I)Ljava/lang/String;
(( com.doodlemobile.gamecenter.aa ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->c(Ljava/lang/String;)V
(( com.doodlemobile.gamecenter.ca ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/ca;->b()V
return;
} // .end method
public final void b ( ) {
/* .locals 0 */
return;
} // .end method
public final void c ( ) {
/* .locals 10 */
int v7 = 0; // const/4 v7, 0x0
final String v9 = "layout"; // const-string v9, "layout"
final String v8 = "dm_leaderboard_listitem"; // const-string v8, "dm_leaderboard_listitem"
final String v6 = "id"; // const-string v6, "id"
final String v0 = "\n\n\n resetLeaderBoard \n\n\n"; // const-string v0, "\n\n\n resetLeaderBoard \n\n\n"
com.doodlemobile.gamecenter.e.b .a ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "top result size: "; // const-string v1, "top result size: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.q;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v0 );
/* new-instance v0, Lcom/doodlemobile/gamecenter/ct; */
v2 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v3 = "layout"; // const-string v3, "layout"
final String v3 = "dm_leaderboard_listitem"; // const-string v3, "dm_leaderboard_listitem"
v3 = com.doodlemobile.gamecenter.cd .a ( v1,v9,v8 );
v4 = this.q;
v5 = this.i;
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/gamecenter/ct;-><init>(Lcom/doodlemobile/gamecenter/aa;Landroid/content/Context;ILjava/util/ArrayList;Ljava/lang/Integer;)V */
this.e = v0;
/* new-instance v0, Lcom/doodlemobile/gamecenter/ct; */
v2 = this.h;
v1 = this.h;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v3 = "layout"; // const-string v3, "layout"
final String v3 = "dm_leaderboard_listitem"; // const-string v3, "dm_leaderboard_listitem"
v3 = com.doodlemobile.gamecenter.cd .a ( v1,v9,v8 );
v4 = this.r;
v5 = this.g;
/* move-object v1, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/gamecenter/ct;-><init>(Lcom/doodlemobile/gamecenter/aa;Landroid/content/Context;ILjava/util/ArrayList;Ljava/lang/Integer;)V */
this.f = v0;
v0 = this.b;
v1 = this.e;
(( android.widget.ListView ) v0 ).setAdapter ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
v0 = this.c;
v1 = this.f;
(( android.widget.ListView ) v0 ).setAdapter ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
v0 = this.h;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v1 = "id"; // const-string v1, "id"
final String v1 = "myscore_headimage"; // const-string v1, "myscore_headimage"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v6,v1 );
(( com.doodlemobile.gamecenter.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/ImageView; */
this.k = v0;
v0 = this.h;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v1 = "id"; // const-string v1, "id"
final String v1 = "myscore_username"; // const-string v1, "myscore_username"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v6,v1 );
(( com.doodlemobile.gamecenter.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.l = v0;
v0 = this.h;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v1 = "id"; // const-string v1, "id"
final String v1 = "myscore_rank"; // const-string v1, "myscore_rank"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v6,v1 );
(( com.doodlemobile.gamecenter.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.m = v0;
v0 = this.h;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v1 = "id"; // const-string v1, "id"
final String v1 = "myscore_topscore"; // const-string v1, "myscore_topscore"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v6,v1 );
(( com.doodlemobile.gamecenter.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.n = v0;
v0 = this.h;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v1 = "id"; // const-string v1, "id"
final String v1 = "myscore_thisscore"; // const-string v1, "myscore_thisscore"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v6,v1 );
(( com.doodlemobile.gamecenter.aa ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.o = v0;
v0 = this.o;
/* const/16 v1, 0x8 */
(( android.widget.TextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
com.doodlemobile.gamecenter.b.b .j ( );
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.o;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "This time: "; // const-string v2, "This time: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.doodlemobile.gamecenter.b.b .j ( );
/* move-result-wide v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.o;
(( android.widget.TextView ) v0 ).setVisibility ( v7 ); // invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V
} // :cond_0
v0 = this.l;
com.doodlemobile.gamecenter.b.b .g ( );
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.m;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Rank: "; // const-string v2, "Rank: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = com.doodlemobile.gamecenter.b.b .h ( );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
v0 = this.n;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Top Score: "; // const-string v2, "Top Score: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.doodlemobile.gamecenter.b.b .i ( );
/* move-result-wide v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
com.doodlemobile.gamecenter.b.b .f ( );
com.doodlemobile.gamecenter.b.c .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* array-length v1, v0 */
android.graphics.BitmapFactory .decodeByteArray ( v0,v7,v1 );
this.j = v0;
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.k;
v1 = this.j;
(( android.widget.ImageView ) v0 ).setImageBitmap ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.k;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setImageBitmap ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
} // .end method
public final java.lang.Integer d ( ) {
/* .locals 8 */
final String v7 = " duration: "; // const-string v7, " duration: "
/* new-instance v0, Lcom/doodlemobile/gamecenter/c/p; */
v1 = this.h;
/* invoke-direct {v0, v1}, Lcom/doodlemobile/gamecenter/c/p;-><init>(Landroid/content/Context;)V */
/* const-wide/16 v1, 0x0 */
java.lang.Long .valueOf ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Profile Activity network begin time: "; // const-string v3, "Profile Activity network begin time: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = " duration: "; // const-string v3, " duration: "
(( java.lang.StringBuilder ) v2 ).append ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v5 */
/* sub-long/2addr v3, v5 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v1 );
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
v2 = com.doodlemobile.gamecenter.f.b .a ( v0 );
/* if-eq v2, v3, :cond_2 */
/* if-ne v0, v2, :cond_1 */
java.lang.Integer .valueOf ( v0 );
} // :goto_0
} // :cond_1
java.lang.Integer .valueOf ( v0 );
} // :cond_2
v0 = this.a;
/* invoke-direct {p0, v0}, Lcom/doodlemobile/gamecenter/aa;->a(Ljava/lang/String;)V */
if ( v1 != null) { // if-eqz v1, :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Profile Activity network done time: "; // const-string v2, "Profile Activity network done time: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " duration: "; // const-string v2, " duration: "
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
(( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* sub-long v1, v2, v4 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.e.b .a ( v0 );
} // :cond_3
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
java.lang.Integer .valueOf ( v0 );
} // .end method
