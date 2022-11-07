public class inal {
	 /* # static fields */
	 private static com.doodle.ltcsmyp.d.f a;
	 private static Boolean e;
	 /* # instance fields */
	 private android.content.Context b;
	 private com.doodle.ltcsmyp.d.b c;
	 private java.util.HashMap d;
	 private Boolean f;
	 private Float g;
	 private Float h;
	 private java.lang.String i;
	 private java.lang.String j;
	 /* # direct methods */
	 private inal ( ) {
		 /* .locals 4 */
		 /* const/16 v1, 0x12 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/doodle/ltcsmyp/d/f;->g:F */
		 /* iput v0, p0, Lcom/doodle/ltcsmyp/d/f;->h:F */
		 final String v0 = "sound/background.ogg"; // const-string v0, "sound/background.ogg"
		 this.i = v0;
		 final String v0 = "sound/backgroundmenu.ogg"; // const-string v0, "sound/backgroundmenu.ogg"
		 this.j = v0;
		 /* new-instance v0, Lcom/doodle/ltcsmyp/d/b; */
		 /* invoke-direct {v0}, Lcom/doodle/ltcsmyp/d/b;-><init>()V */
		 this.c = v0;
		 this.b = p1;
		 com.doodle.ltcsmyp.d.f.e = (v3!= 0);
		 /* new-array v0, v1, [I */
		 /* fill-array-data v0, :array_0 */
		 /* new-array v1, v1, [Ljava/lang/String; */
		 final String v2 = "mousemove.ogg"; // const-string v2, "mousemove.ogg"
		 /* aput-object v2, v1, v3 */
		 int v2 = 1; // const/4 v2, 0x1
		 final String v3 = "tapmouse.ogg"; // const-string v3, "tapmouse.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 2; // const/4 v2, 0x2
		 final String v3 = "tapcheese.ogg"; // const-string v3, "tapcheese.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 3; // const/4 v2, 0x3
		 final String v3 = "catlaughs.ogg"; // const-string v3, "catlaughs.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 4; // const/4 v2, 0x4
		 final String v3 = "button.ogg"; // const-string v3, "button.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 5; // const/4 v2, 0x5
		 final String v3 = "tapice.ogg"; // const-string v3, "tapice.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 6; // const/4 v2, 0x6
		 final String v3 = "taprandom.ogg"; // const-string v3, "taprandom.ogg"
		 /* aput-object v3, v1, v2 */
		 int v2 = 7; // const/4 v2, 0x7
		 final String v3 = "tvwhitenoise.ogg"; // const-string v3, "tvwhitenoise.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0x8 */
		 final String v3 = "tvchannelswitch.ogg"; // const-string v3, "tvchannelswitch.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0x9 */
		 final String v3 = "newrecord.ogg"; // const-string v3, "newrecord.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xa */
		 final String v3 = "wooddrop.ogg"; // const-string v3, "wooddrop.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xb */
		 final String v3 = "scratch.ogg"; // const-string v3, "scratch.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xc */
		 final String v3 = "miceambience.ogg"; // const-string v3, "miceambience.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xd */
		 final String v3 = "showcheese.ogg"; // const-string v3, "showcheese.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xe */
		 final String v3 = "scorerolling.ogg"; // const-string v3, "scorerolling.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0xf */
		 final String v3 = "micecheers.ogg"; // const-string v3, "micecheers.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0x10 */
		 final String v3 = "lock.ogg"; // const-string v3, "lock.ogg"
		 /* aput-object v3, v1, v2 */
		 /* const/16 v2, 0x11 */
		 final String v3 = "victory.ogg"; // const-string v3, "victory.ogg"
		 /* aput-object v3, v1, v2 */
		 /* invoke-direct {p0, v0, v1}, Lcom/doodle/ltcsmyp/d/f;->a([I[Ljava/lang/String;)V */
		 /* iget v0, p0, Lcom/doodle/ltcsmyp/d/f;->h:F */
		 v1 = this.c;
		 (( com.doodle.ltcsmyp.d.b ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodle/ltcsmyp/d/b;->a(F)V
		 /* const v1, 0x3dcccccd # 0.1f */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gez v0, :cond_0 */
		 com.doodle.ltcsmyp.d.b .a ( );
	 } // :goto_0
	 return;
} // :cond_0
com.doodle.ltcsmyp.d.b .b ( );
/* :array_0 */
/* .array-data 4 */
/* 0x66 */
/* 0x67 */
/* 0x68 */
/* 0x69 */
/* 0x6b */
/* 0x70 */
/* 0x71 */
/* 0x6e */
/* 0x6d */
/* 0x72 */
/* 0x6c */
/* 0x6f */
/* 0x65 */
/* 0x73 */
/* 0x74 */
/* 0x75 */
/* 0x76 */
/* 0x77 */
} // .end array-data
} // .end method
public static com.doodle.ltcsmyp.d.f a ( android.content.Context p0 ) {
/* .locals 1 */
v0 = com.doodle.ltcsmyp.d.f.a;
/* if-nez v0, :cond_0 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* new-instance v0, Lcom/doodle/ltcsmyp/d/f; */
/* invoke-direct {v0, p0}, Lcom/doodle/ltcsmyp/d/f;-><init>(Landroid/content/Context;)V */
} // :cond_0
v0 = com.doodle.ltcsmyp.d.f.a;
} // .end method
private void a ( Integer[] p0, java.lang.String[] p1 ) {
/* .locals 7 */
/* array-length v0, p1 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V */
this.d = v1;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
v2 = this.d;
/* aget v3, p1, v1 */
java.lang.Integer .valueOf ( v3 );
v4 = this.c;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "sound/"; // const-string v6, "sound/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* aget-object v6, p2, v1 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v6 = this.b;
(( com.doodle.ltcsmyp.d.b ) v4 ).a ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/doodle/ltcsmyp/d/b;->a(Ljava/lang/String;Landroid/content/Context;)Lcom/doodle/ltcsmyp/d/c;
(( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public static void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.doodle.ltcsmyp.d.f.e = (v0!= 0);
com.doodle.ltcsmyp.d.d .a ( );
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
v0 = this.d;
/* const/16 v1, 0x74 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Lcom/doodle/ltcsmyp/d/c; */
(( com.doodle.ltcsmyp.d.c ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyp/d/c;->b()V
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
v0 = this.d;
/* if-nez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.d;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Lcom/doodle/ltcsmyp/d/c; */
if ( p0 != null) { // if-eqz p0, :cond_0
(( com.doodle.ltcsmyp.d.c ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyp/d/c;->a()Lcom/doodle/ltcsmyp/d/e;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyp/d/f;->f:Z */
/* if-nez v0, :cond_0 */
/* sget-boolean v0, Lcom/doodle/ltcsmyp/d/f;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
} // :goto_0
return;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
com.doodle.ltcsmyp.d.f.e = (v0!= 0);
com.doodle.ltcsmyp.d.d .c ( );
final String v0 = "menu"; // const-string v0, "menu"
v0 = (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_2 */
v0 = this.j;
v1 = this.b;
com.doodle.ltcsmyp.d.d .a ( v0,v1 );
} // :goto_1
com.doodle.ltcsmyp.d.d .e ( );
/* iget v1, p0, Lcom/doodle/ltcsmyp/d/f;->g:F */
/* iget v2, p0, Lcom/doodle/ltcsmyp/d/f;->g:F */
(( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
} // :cond_2
v0 = this.i;
v1 = this.b;
com.doodle.ltcsmyp.d.d .a ( v0,v1 );
} // .end method
