public class com.doodle.ltcsmyb.MainActivity extends com.doodlemobile.basket.GameActivity implements com.doodlemobile.basket.q implements com.doodlemobile.basket.ui.a.d implements com.doodlemobile.basket.ui.c implements com.doodlemobile.basket.ui.f {
	 /* # interfaces */
	 /* # static fields */
	 private static Integer bL;
	 public static com.doodle.ltcsmyb.c.a c;
	 /* # instance fields */
	 private android.os.Handler A;
	 private final Integer B;
	 private Integer C;
	 private Boolean D;
	 private Boolean E;
	 private F;
	 private Integer G;
	 private com.doodlemobile.basket.ui.a.j H;
	 private android.graphics.Bitmap I;
	 private com.doodlemobile.basket.test.b J;
	 private android.view.View K;
	 private com.doodle.ltcsmyb.a L;
	 private com.doodlemobile.basket.ui.e M;
	 private com.doodlemobile.basket.ui.e N;
	 private com.doodlemobile.basket.ui.e O;
	 private com.doodlemobile.basket.ui.UIViewGroup P;
	 private com.doodlemobile.basket.ui.a.j Q;
	 private com.doodlemobile.basket.ui.a.j R;
	 private com.doodlemobile.basket.ui.a.j S;
	 private com.doodlemobile.basket.ui.ImageView T;
	 private com.doodlemobile.basket.ui.ImageView U;
	 private com.doodlemobile.basket.ui.ImageView V;
	 private com.doodlemobile.basket.ui.ImageView W;
	 private com.doodlemobile.basket.ui.ImageView X;
	 private com.doodlemobile.basket.ui.ImageView Y;
	 private com.doodlemobile.basket.ui.ImageView Z;
	 com.doodlemobile.gamecenter.d.c a;
	 private com.doodlemobile.basket.ui.AnimationView aA;
	 private com.doodlemobile.basket.ui.AnimationView aB;
	 private com.doodlemobile.basket.ui.AnimationView aC;
	 private com.doodlemobile.basket.ui.AnimationView aD;
	 private com.doodlemobile.basket.ui.AnimationView aE;
	 private com.doodlemobile.basket.ui.AnimationView aF;
	 private com.doodlemobile.basket.ui.AnimationView aG;
	 private com.doodlemobile.basket.ui.AnimationView aH;
	 private com.doodlemobile.basket.ui.AnimationView aI;
	 private com.doodlemobile.basket.ui.TextView aJ;
	 private com.doodlemobile.basket.ui.TextView aK;
	 private com.doodlemobile.basket.ui.TextView aL;
	 private com.doodlemobile.basket.ui.TextView aM;
	 private com.doodlemobile.basket.ui.TextView aN;
	 private com.doodlemobile.basket.ui.TextView aO;
	 private com.doodlemobile.basket.ui.TextView aP;
	 private com.doodlemobile.basket.ui.TextView aQ;
	 private com.doodlemobile.basket.ui.AnimationView aR;
	 private com.doodlemobile.basket.ui.Button aS;
	 private com.doodlemobile.basket.ui.Button aT;
	 private com.doodlemobile.basket.ui.Button aU;
	 private com.doodlemobile.basket.ui.Button aV;
	 private com.doodlemobile.basket.ui.Button aW;
	 private com.doodlemobile.basket.ui.Button aX;
	 private com.doodlemobile.basket.ui.Button aY;
	 private com.doodlemobile.basket.ui.Button aZ;
	 private com.doodlemobile.basket.ui.ImageView aa;
	 private com.doodlemobile.basket.ui.ImageView ab;
	 private com.doodlemobile.basket.ui.ImageView ac;
	 private com.doodlemobile.basket.ui.ImageView ad;
	 private com.doodlemobile.basket.ui.Button ae;
	 private com.doodlemobile.basket.ui.b af;
	 private com.doodlemobile.basket.ui.b ag;
	 private com.doodlemobile.basket.ui.b ah;
	 private com.doodlemobile.basket.ui.b ai;
	 private com.doodlemobile.basket.ui.b aj;
	 private com.doodlemobile.basket.ui.b ak;
	 private com.doodlemobile.basket.ui.b al;
	 private com.doodlemobile.basket.ui.b am;
	 private com.doodlemobile.basket.ui.b an;
	 private com.doodlemobile.basket.ui.b ao;
	 private com.doodlemobile.basket.ui.b ap;
	 private com.doodlemobile.basket.ui.b aq;
	 private com.doodlemobile.basket.ui.b ar;
	 private com.doodlemobile.basket.ui.b as;
	 private com.doodlemobile.basket.ui.b at;
	 private com.doodlemobile.basket.ui.b au;
	 private com.doodlemobile.basket.ui.b av;
	 private com.doodlemobile.basket.ui.b aw;
	 private com.doodlemobile.basket.ui.b ax;
	 private com.doodlemobile.basket.ui.AnimationView ay;
	 private com.doodlemobile.basket.ui.AnimationView az;
	 com.doodlemobile.basket.ui.AnimationView b;
	 private Boolean bA;
	 private Boolean bB;
	 private Boolean bC;
	 private Boolean bD;
	 private Boolean bE;
	 private Boolean bF;
	 private Boolean bG;
	 private java.util.Random bH;
	 private com.doodlemobile.basket.ui.ImageView bI;
	 private Float bJ;
	 private bK;
	 private Boolean bM;
	 private Boolean bN;
	 private Boolean bO;
	 private Boolean bP;
	 private Boolean bQ;
	 private Integer bR;
	 private bS;
	 private Integer bT;
	 private Integer bU;
	 private Boolean bV;
	 private Boolean bW;
	 private Boolean bX;
	 private Boolean bY;
	 private Float bZ;
	 private com.doodlemobile.basket.ui.Button ba;
	 private com.doodlemobile.basket.ui.Button bb;
	 private com.doodlemobile.basket.ui.Button bc;
	 private com.doodlemobile.basket.ui.Button bd;
	 private com.doodlemobile.basket.ui.Button be;
	 private com.doodlemobile.basket.ui.Button bf;
	 private com.doodlemobile.basket.ui.Button bg;
	 private com.doodlemobile.basket.ui.Button bh;
	 private com.doodlemobile.basket.ui.Button bi;
	 private com.doodlemobile.basket.ui.Button bj;
	 private com.doodlemobile.basket.ui.Button bk;
	 private com.doodlemobile.basket.ui.Button bl;
	 private com.doodlemobile.basket.ui.Button bm;
	 private com.doodlemobile.basket.ui.Button bn;
	 private com.doodlemobile.basket.ui.Button bo;
	 private com.doodlemobile.basket.ui.Button bp;
	 private com.doodlemobile.basket.ui.Button bq;
	 private com.doodlemobile.basket.ui.Button br;
	 private com.doodlemobile.basket.ui.Button bs;
	 private com.doodlemobile.basket.ui.Button bt;
	 private com.doodlemobile.basket.ui.Button bu;
	 private Boolean bv;
	 private Boolean bw;
	 private Boolean bx;
	 private Boolean by;
	 private Boolean bz;
	 private Boolean cA;
	 private Boolean cB;
	 private Boolean cC;
	 private Float cD;
	 private Float cE;
	 private Boolean cF;
	 private Boolean cG;
	 private Boolean cH;
	 private Boolean cI;
	 private Float cJ;
	 private Float cK;
	 private Boolean cL;
	 private Float cM;
	 private Boolean cN;
	 private com.doodle.ltcsmyb.j cO;
	 private com.doodle.ltcsmyb.b cP;
	 private Boolean cQ;
	 private com.doodle.ltcsmyb.TvPanel cR;
	 private Boolean cS;
	 private Boolean cT;
	 private Boolean cU;
	 private Boolean cV;
	 private Boolean cW;
	 private Boolean cX;
	 private Float ca;
	 private Boolean cb;
	 private Boolean cc;
	 private Boolean cd;
	 private Boolean ce;
	 private Float cf;
	 private Float cg;
	 private Boolean ch;
	 private Boolean ci;
	 private Boolean cj;
	 private Boolean ck;
	 private Float cl;
	 private Float cm;
	 private Boolean cn;
	 private Boolean co;
	 private Boolean cp;
	 private Boolean cq;
	 private Float cr;
	 private Float cs;
	 private Boolean ct;
	 private Boolean cu;
	 private Boolean cv;
	 private Boolean cw;
	 private Float cx;
	 private Float cy;
	 private Boolean cz;
	 private Integer p;
	 private Boolean q;
	 private final Integer r;
	 private final Integer s;
	 private final Integer t;
	 private final Integer u;
	 private final Integer v;
	 private final Integer w;
	 private final Integer x;
	 private final Integer y;
	 private com.doodlemobile.gamecenter.bi z;
	 /* # direct methods */
	 static com.doodle.ltcsmyb.MainActivity ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 return;
	 } // .end method
	 public com.doodle.ltcsmyb.MainActivity ( ) {
		 /* .locals 6 */
		 /* const/16 v5, 0x14 */
		 int v4 = 1; // const/4 v4, 0x1
		 /* const v3, 0x3ebd8adb # 0.3702f */
		 /* const v2, 0x3e99999a # 0.3f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/GameActivity;-><init>()V */
		 /* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->p:I */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->q:Z */
		 /* const/16 v0, 0x65 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->r:I */
		 /* const/16 v0, 0x66 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->s:I */
		 /* const/16 v0, 0x67 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->t:I */
		 /* const/16 v0, 0x68 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->u:I */
		 /* const/16 v0, 0x69 */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->v:I */
		 /* const/16 v0, 0x6a */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->w:I */
		 /* const/16 v0, 0x6b */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->x:I */
		 /* const/16 v0, 0x6c */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->y:I */
		 int v0 = 0; // const/4 v0, 0x0
		 this.z = v0;
		 /* new-instance v0, Lcom/doodle/ltcsmyb/h; */
		 /* invoke-direct {v0, p0}, Lcom/doodle/ltcsmyb/h;-><init>(Lcom/doodle/ltcsmyb/MainActivity;)V */
		 this.A = v0;
		 /* const/16 v0, 0x7dc */
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->B:I */
		 /* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->C:I */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->D:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->E:Z */
		 /* new-array v0, v5, [I */
		 this.F = v0;
		 /* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
		 /* new-array v0, v5, [Lcom/doodlemobile/basket/ui/a/j; */
		 this.H = v0;
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/b; */
		 this.aw = v0;
		 /* const/16 v0, 0x64 */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/b; */
		 this.ax = v0;
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.ay = v0;
		 /* const/16 v0, 0x7d */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/TextView; */
		 this.aP = v0;
		 /* const/16 v0, 0x177 */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/AnimationView; */
		 this.aR = v0;
		 /* const/16 v0, 0x7d */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/Button; */
		 this.aS = v0;
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bv:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bw:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bx:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bz:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bA:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bB:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bC:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bD:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bE:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bF:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bG:Z */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.bH = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
		 /* const/16 v0, 0x7d */
		 /* new-array v0, v0, [I */
		 this.bK = v0;
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bM:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bN:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bO:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bP:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bQ:Z */
		 /* iput v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->bR:I */
		 /* new-array v0, v5, [I */
		 this.bS = v0;
		 /* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bT:I */
		 /* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bU:I */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bV:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bW:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bX:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bY:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cb:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cc:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cd:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->ce:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->ch:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->ci:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cj:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->ck:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cn:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->co:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cp:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cq:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->ct:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cu:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cv:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cw:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cz:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cA:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cB:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cC:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cF:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cG:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cH:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cI:Z */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
		 /* iput v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cL:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cN:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cQ:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cS:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cT:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cU:Z */
		 /* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cV:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cW:Z */
		 /* iput-boolean v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cX:Z */
		 return;
	 } // .end method
	 private void A ( ) {
		 /* .locals 8 */
		 /* const/16 v7, 0x7d */
		 /* const/16 v4, 0x64 */
		 int v6 = 1; // const/4 v6, 0x1
		 int v5 = 0; // const/4 v5, 0x0
		 com.doodle.ltcsmyb.a.a .a ( p0 );
		 (( com.doodle.ltcsmyb.a.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->a()[I
		 /* move v1, v5 */
		 /* move v2, v5 */
	 } // :goto_0
	 /* if-ge v1, v7, :cond_0 */
	 /* aget v3, v0, v1 */
	 /* add-int/2addr v2, v3 */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* const/16 v1, 0xa */
/* if-ge v2, v1, :cond_1 */
v1 = this.aQ;
(( com.doodlemobile.basket.ui.TextView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/TextView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x43160000 # 150.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = this.aF;
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x43430000 # 195.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
} // :goto_1
/* const/16 v1, 0x12c */
/* if-lt v2, v1, :cond_3 */
v1 = this.aG;
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).a ( v6 ); // invoke-virtual {v1, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :goto_2
/* move v1, v4 */
/* move v3, v5 */
} // :goto_3
/* if-ge v1, v7, :cond_4 */
/* aget v4, v0, v1 */
/* add-int/2addr v3, v4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* if-ge v2, v4, :cond_2 */
v1 = this.aQ;
(( com.doodlemobile.basket.ui.TextView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/TextView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x431b0000 # 155.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = this.aF;
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x43520000 # 210.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
} // :cond_2
v1 = this.aQ;
(( com.doodlemobile.basket.ui.TextView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/TextView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x43250000 # 165.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = this.aF;
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v3, 0x435c0000 # 220.0f */
/* iput v3, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
} // :cond_3
v1 = this.aG;
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_4
/* const/16 v0, 0x4b */
/* if-lt v3, v0, :cond_5 */
v0 = this.aH;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :goto_4
v0 = this.aQ;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = ""; // const-string v4, ""
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // :cond_5
v0 = this.aH;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v5 ); // invoke-virtual {v0, v5}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // .end method
private void B ( ) {
/* .locals 3 */
/* const/high16 v2, -0x3c6c0000 # -296.0f */
/* const/high16 v1, -0x3cfb0000 # -133.0f */
v0 = this.av;
/* iput v2, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.av;
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.au;
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.au;
/* iput v2, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
return;
} // .end method
private void C ( ) {
/* .locals 19 */
v3 = com.doodle.ltcsmyb.MainActivity.n;
/* const v4, 0x7f020009 */
com.doodlemobile.basket.graphics.Animation .a ( v3,v4 );
v3 = com.doodle.ltcsmyb.MainActivity.n;
/* const v4, 0x7f020014 */
com.doodlemobile.basket.graphics.d .a ( v3,v4 );
v3 = com.doodle.ltcsmyb.MainActivity.n;
/* const v4, 0x7f020015 */
com.doodlemobile.basket.graphics.d .a ( v3,v4 );
/* move-object/from16 v0, p0 */
v0 = this.M;
/* move-object v3, v0 */
/* const v4, 0x7f0900f2 */
(( com.doodlemobile.basket.ui.e ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v3, Lcom/doodlemobile/basket/ui/Panel; */
/* move-object/from16 v0, p0 */
v0 = this.M;
/* move-object v4, v0 */
/* const v5, 0x7f0900f7 */
(( com.doodlemobile.basket.ui.e ) v4 ).b ( v5 ); // invoke-virtual {v4, v5}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v4, Lcom/doodlemobile/basket/ui/Panel; */
/* move-object/from16 v0, p0 */
v0 = this.M;
/* move-object v5, v0 */
/* const v6, 0x7f0900fc */
(( com.doodlemobile.basket.ui.e ) v5 ).b ( v6 ); // invoke-virtual {v5, v6}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v5, Lcom/doodlemobile/basket/ui/Panel; */
/* move-object/from16 v0, p0 */
v0 = this.M;
/* move-object v6, v0 */
/* const v7, 0x7f090101 */
(( com.doodlemobile.basket.ui.e ) v6 ).b ( v7 ); // invoke-virtual {v6, v7}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v6, Lcom/doodlemobile/basket/ui/Panel; */
/* move-object/from16 v0, p0 */
v0 = this.M;
/* move-object v7, v0 */
/* const v11, 0x7f090106 */
(( com.doodlemobile.basket.ui.e ) v7 ).b ( v11 ); // invoke-virtual {v7, v11}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v7, Lcom/doodlemobile/basket/ui/Panel; */
int v11 = 0; // const/4 v11, 0x0
} // :goto_0
/* const/16 v12, 0x7d */
/* if-ge v11, v12, :cond_c */
/* new-instance v12, Lcom/doodlemobile/basket/ui/Panel; */
v13 = com.doodle.ltcsmyb.MainActivity.n;
/* invoke-direct {v12, v13}, Lcom/doodlemobile/basket/ui/Panel;-><init>(Lcom/doodlemobile/basket/b/b;)V */
/* new-instance v13, Lcom/doodlemobile/basket/ui/b; */
/* invoke-direct {v13}, Lcom/doodlemobile/basket/ui/b;-><init>()V */
int v14 = 0; // const/4 v14, 0x0
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
int v14 = 0; // const/4 v14, 0x0
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v14, 0x42900000 # 72.0f */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->a:F */
/* const/high16 v14, 0x42800000 # 64.0f */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->b:F */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v14, v0 */
/* new-instance v15, Lcom/doodlemobile/basket/ui/Button; */
v16 = com.doodle.ltcsmyb.MainActivity.n;
/* move-object v0, v15 */
/* move-object/from16 v1, v16 */
/* move-object v2, v8 */
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/basket/ui/Button;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/Animation;)V */
/* aput-object v15, v14, v11 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* const v15, 0x12d644 */
/* add-int/2addr v15, v11 */
(( com.doodlemobile.basket.ui.Button ) v14 ).d ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/Button;->d(I)V
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
(( com.doodlemobile.basket.ui.Button ) v14 ).a ( v13 ); // invoke-virtual {v14, v13}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* move-object/from16 v0, p0 */
/* move-object v1, v14 */
this.q = v0;
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
(( com.doodlemobile.basket.ui.Panel ) v12 ).a ( v14 ); // invoke-virtual {v12, v14}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
/* add-int/lit8 v14, v11, 0x1 */
/* div-int/lit8 v14, v14, 0xa */
/* if-lez v14, :cond_1 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* new-instance v15, Lcom/doodlemobile/basket/ui/TextView; */
v16 = com.doodle.ltcsmyb.MainActivity.n;
/* move-object v0, v15 */
/* move-object/from16 v1, v16 */
/* move-object v2, v10 */
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/basket/ui/TextView;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/d;)V */
/* aput-object v15, v14, v11 */
} // :goto_1
/* const/16 v14, 0x19 */
/* if-ge v11, v14, :cond_2 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
final String v16 = ""; // const-string v16, ""
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* add-int/lit8 v16, v11, 0x1 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
} // :cond_0
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v13 ); // invoke-virtual {v14, v13}, Lcom/doodlemobile/basket/ui/TextView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v13, v0 */
/* aget-object v13, v13, v11 */
(( com.doodlemobile.basket.ui.Panel ) v12 ).a ( v13 ); // invoke-virtual {v12, v13}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
int v13 = 0; // const/4 v13, 0x0
} // :goto_3
int v14 = 3; // const/4 v14, 0x3
/* if-ge v13, v14, :cond_6 */
/* new-instance v14, Lcom/doodlemobile/basket/ui/b; */
/* invoke-direct {v14}, Lcom/doodlemobile/basket/ui/b;-><init>()V */
/* mul-int/lit8 v15, v13, 0xa */
/* add-int/lit8 v15, v15, 0xd */
/* int-to-float v15, v15 */
/* iput v15, v14, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v15, 0x41a00000 # 20.0f */
/* iput v15, v14, Lcom/doodlemobile/basket/ui/b;->d:F */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v15, v0 */
/* mul-int/lit8 v16, v11, 0x3 */
/* add-int v16, v16, v13 */
/* new-instance v17, Lcom/doodlemobile/basket/ui/AnimationView; */
v18 = com.doodle.ltcsmyb.MainActivity.n;
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, v18 */
/* move-object v2, v8 */
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/basket/ui/AnimationView;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/Animation;)V */
/* aput-object v17, v15, v16 */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v15, v0 */
/* mul-int/lit8 v16, v11, 0x3 */
/* add-int v16, v16, v13 */
/* aget-object v15, v15, v16 */
/* const v16, 0x7f0901c3 */
/* invoke-virtual/range {v15 ..v16}, Lcom/doodlemobile/basket/ui/AnimationView;->a(I)V */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v15, v0 */
/* mul-int/lit8 v16, v11, 0x3 */
/* add-int v16, v16, v13 */
/* aget-object v15, v15, v16 */
(( com.doodlemobile.basket.ui.AnimationView ) v15 ).a ( v14 ); // invoke-virtual {v15, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v14, v0 */
/* mul-int/lit8 v15, v11, 0x3 */
/* add-int/2addr v15, v13 */
/* aget-object v14, v14, v15 */
/* const v15, 0x3f4ccccd # 0.8f */
(( com.doodlemobile.basket.ui.AnimationView ) v14 ).a_ ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/AnimationView;->a_(F)V
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v14, v0 */
/* mul-int/lit8 v15, v11, 0x3 */
/* add-int/2addr v15, v13 */
/* aget-object v14, v14, v15 */
(( com.doodlemobile.basket.ui.Panel ) v12 ).a ( v14 ); // invoke-virtual {v12, v14}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
/* add-int/lit8 v13, v13, 0x1 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* new-instance v15, Lcom/doodlemobile/basket/ui/TextView; */
v16 = com.doodle.ltcsmyb.MainActivity.n;
/* move-object v0, v15 */
/* move-object/from16 v1, v16 */
/* move-object v2, v9 */
/* invoke-direct {v0, v1, v2}, Lcom/doodlemobile/basket/ui/TextView;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/d;)V */
/* aput-object v15, v14, v11 */
/* goto/16 :goto_1 */
} // :cond_2
/* const/16 v14, 0x32 */
/* if-ge v11, v14, :cond_3 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
final String v16 = ""; // const-string v16, ""
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* const/16 v16, 0x18 */
/* sub-int v16, v11, v16 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_2 */
} // :cond_3
/* const/16 v14, 0x4b */
/* if-ge v11, v14, :cond_4 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
final String v16 = ""; // const-string v16, ""
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* const/16 v16, 0x31 */
/* sub-int v16, v11, v16 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_2 */
} // :cond_4
/* const/16 v14, 0x64 */
/* if-ge v11, v14, :cond_5 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
final String v16 = ""; // const-string v16, ""
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* const/16 v16, 0x4a */
/* sub-int v16, v11, v16 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_2 */
} // :cond_5
/* const/16 v14, 0x7d */
/* if-ge v11, v14, :cond_0 */
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v14, v0 */
/* aget-object v14, v14, v11 */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
final String v16 = ""; // const-string v16, ""
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* const/16 v16, 0x63 */
/* sub-int v16, v11, v16 */
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_2 */
} // :cond_6
/* new-instance v13, Lcom/doodlemobile/basket/ui/b; */
/* invoke-direct {v13}, Lcom/doodlemobile/basket/ui/b;-><init>()V */
/* const/16 v14, 0x19 */
/* if-ge v11, v14, :cond_8 */
/* rem-int/lit8 v14, v11, 0x5 */
/* mul-int/lit8 v14, v14, 0x5e */
/* add-int/lit16 v14, v14, -0xbb */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
/* div-int/lit8 v14, v11, 0x5 */
/* mul-int/lit8 v14, v14, 0x65 */
/* add-int/lit16 v14, v14, -0xde */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
(( com.doodlemobile.basket.ui.Panel ) v3 ).a ( v12 ); // invoke-virtual {v3, v12}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
} // :cond_7
} // :goto_4
(( com.doodlemobile.basket.ui.Panel ) v12 ).a ( v13 ); // invoke-virtual {v12, v13}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/b;)V
/* add-int/lit8 v11, v11, 0x1 */
/* goto/16 :goto_0 */
} // :cond_8
/* const/16 v14, 0x32 */
/* if-ge v11, v14, :cond_9 */
/* const/16 v14, 0x19 */
/* sub-int v14, v11, v14 */
/* rem-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x5e */
/* add-int/lit16 v14, v14, -0xbb */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v14, 0x19 */
/* sub-int v14, v11, v14 */
/* div-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x65 */
/* add-int/lit16 v14, v14, -0xde */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
(( com.doodlemobile.basket.ui.Panel ) v4 ).a ( v12 ); // invoke-virtual {v4, v12}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
} // :cond_9
/* const/16 v14, 0x4b */
/* if-ge v11, v14, :cond_a */
/* const/16 v14, 0x32 */
/* sub-int v14, v11, v14 */
/* rem-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x5e */
/* add-int/lit16 v14, v14, -0xbb */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v14, 0x32 */
/* sub-int v14, v11, v14 */
/* div-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x65 */
/* add-int/lit16 v14, v14, -0xde */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
(( com.doodlemobile.basket.ui.Panel ) v5 ).a ( v12 ); // invoke-virtual {v5, v12}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
} // :cond_a
/* const/16 v14, 0x64 */
/* if-ge v11, v14, :cond_b */
/* const/16 v14, 0x4b */
/* sub-int v14, v11, v14 */
/* rem-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x5e */
/* add-int/lit16 v14, v14, -0xbb */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v14, 0x4b */
/* sub-int v14, v11, v14 */
/* div-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x65 */
/* add-int/lit16 v14, v14, -0xde */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
(( com.doodlemobile.basket.ui.Panel ) v6 ).a ( v12 ); // invoke-virtual {v6, v12}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
} // :cond_b
/* const/16 v14, 0x7d */
/* if-ge v11, v14, :cond_7 */
/* const/16 v14, 0x64 */
/* sub-int v14, v11, v14 */
/* rem-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x5e */
/* add-int/lit16 v14, v14, -0xbb */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/16 v14, 0x64 */
/* sub-int v14, v11, v14 */
/* div-int/lit8 v14, v14, 0x5 */
/* mul-int/lit8 v14, v14, 0x65 */
/* add-int/lit16 v14, v14, -0xde */
/* int-to-float v14, v14 */
/* iput v14, v13, Lcom/doodlemobile/basket/ui/b;->d:F */
(( com.doodlemobile.basket.ui.Panel ) v7 ).a ( v12 ); // invoke-virtual {v7, v12}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/ui/e;)V
/* goto/16 :goto_4 */
} // :cond_c
/* invoke-virtual/range {p0 ..p0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V */
return;
} // .end method
static com.doodlemobile.gamecenter.bi a ( com.doodle.ltcsmyb.MainActivity p0, com.doodlemobile.gamecenter.bi p1 ) { //synthethic
/* .locals 0 */
this.z = p1;
} // .end method
static void a ( com.doodle.ltcsmyb.MainActivity p0 ) { //synthethic
/* .locals 3 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
final String v1 = "Are you sure you want to reset?\nThis action cannot be undone!"; // const-string v1, "Are you sure you want to reset?\nThis action cannot be undone!"
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "Reset Game"; // const-string v1, "Reset Game"
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
final String v1 = "No"; // const-string v1, "No"
/* new-instance v2, Lcom/doodle/ltcsmyb/i; */
/* invoke-direct {v2, p0}, Lcom/doodle/ltcsmyb/i;-><init>(Lcom/doodle/ltcsmyb/MainActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
final String v1 = "Yes"; // const-string v1, "Yes"
/* new-instance v2, Lcom/doodle/ltcsmyb/g; */
/* invoke-direct {v2, p0}, Lcom/doodle/ltcsmyb/g;-><init>(Lcom/doodle/ltcsmyb/MainActivity;)V */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
return;
} // .end method
private void a ( com.doodlemobile.basket.ui.Button p0, Float p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_0 */
v1 = (( com.doodlemobile.basket.ui.Button ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/Button;->g()I
v2 = this.aS;
/* aget-object v2, v2, v0 */
v2 = (( com.doodlemobile.basket.ui.Button ) v2 ).g ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/ui/Button;->g()I
/* if-ne v1, v2, :cond_1 */
v1 = this.aS;
/* aget-object v0, v1, v0 */
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
} // :cond_0
return;
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
static com.doodlemobile.gamecenter.bi b ( com.doodle.ltcsmyb.MainActivity p0 ) { //synthethic
/* .locals 1 */
v0 = this.z;
} // .end method
static android.view.View c ( com.doodle.ltcsmyb.MainActivity p0 ) { //synthethic
/* .locals 1 */
v0 = this.K;
} // .end method
private void d ( Integer p0 ) {
/* .locals 6 */
/* const/16 v5, 0x19 */
/* const v3, 0x7f0900d0 */
/* const/16 v1, 0x6a */
int v2 = 0; // const/4 v2, 0x0
int v4 = 1; // const/4 v4, 0x1
/* sparse-switch p1, :sswitch_data_0 */
/* move v0, v2 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v1, 0x6b */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_0
return;
/* :sswitch_0 */
final String v0 = "Cheese Tower Feature Game Button"; // const-string v0, "Cheese Tower Feature Game Button"
com.flurry.android.FlurryAgent .a ( v0 );
v0 = this.A;
/* const/16 v1, 0x68 */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* move v0, v2 */
/* :sswitch_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Complete Level "; // const-string v1, "Complete Level "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " Rate Button"; // const-string v1, " Rate Button"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .a ( v0 );
v0 = this.A;
/* const/16 v1, 0x67 */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* move v0, v4 */
/* :sswitch_2 */
final String v0 = "Mainmenu Rate Button"; // const-string v0, "Mainmenu Rate Button"
com.flurry.android.FlurryAgent .a ( v0 );
v0 = this.A;
/* const/16 v1, 0x67 */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* move v0, v4 */
/* :sswitch_3 */
v0 = this.bp;
v0 = (( com.doodlemobile.basket.ui.Button ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->d()I
/* const v1, 0x7f09008e */
/* if-ne v0, v1, :cond_1 */
v0 = this.bp;
/* const v1, 0x7f09026b */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a/a;->a(Z)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a/a;->b(Z)V
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
/* move v0, v2 */
/* goto/16 :goto_0 */
} // :cond_1
v0 = this.bp;
/* const v1, 0x7f09008e */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).b ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a/a;->b(Z)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a/a;->a(Z)V
com.doodle.ltcsmyb.d.f .a ( p0 );
final String v1 = "background"; // const-string v1, "background"
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(Ljava/lang/String;)V
/* move v0, v2 */
/* goto/16 :goto_0 */
/* :sswitch_4 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bv:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bv:Z */
com.doodlemobile.gamecenter.a.f .b ( );
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* const v0, 0x7f090131 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_5 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bw:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bw:Z */
v0 = this.M;
/* const v1, 0x7f09010a */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.ba;
/* const v1, 0x7f090269 */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :goto_1
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.aZ;
/* const v1, 0x7f09010f */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :goto_2
/* const v0, 0x7f090134 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_2
v0 = this.ba;
/* const v1, 0x7f09010d */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :cond_3
v0 = this.aZ;
/* const v1, 0x7f09026a */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* :sswitch_6 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bx:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bx:Z */
v0 = this.M;
/* const v1, 0x7f090115 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* const v0, 0x7f090132 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_7 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* const v0, 0x7f09013b */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->y()V */
v0 = this.M;
/* const v1, 0x7f0900bc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_8 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bE:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bE:Z */
/* const v0, 0x7f090135 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
/* const v1, 0x7f0900bc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_9 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bF:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bF:Z */
/* const v0, 0x7f090133 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
/* const v1, 0x7f0900bc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_a */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bz:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bz:Z */
v0 = this.aI;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* const v0, 0x7f09013d */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_b */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bA:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bA:Z */
v0 = this.aI;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* const v0, 0x7f09013f */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_c */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bB:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bB:Z */
v0 = this.aI;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* const v0, 0x7f090141 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_d */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bC:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bC:Z */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* const v0, 0x7f090145 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_e */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bD:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bD:Z */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->A()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->v()V */
/* const v0, 0x7f090144 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_f */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bG:Z */
/* if-nez v0, :cond_0 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bG:Z */
/* if-ge v0, v5, :cond_6 */
v0 = this.aO;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "1-"; // const-string v2, "1-"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v2, v2, 0x1 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
} // :cond_4
} // :goto_3
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-nez v0, :cond_5 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_a
} // :cond_5
v0 = this.bp;
/* const v1, 0x7f09008e */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :goto_4
v0 = this.L;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1f
v0 = this.L;
v0 = this.a;
v0 = (( com.doodle.ltcsmyb.c.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->a()Z
/* if-eq v0, v4, :cond_1f */
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.d .d ( );
v0 = this.L;
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->p()V
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a;->a(Z)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->f()V
/* const v0, 0x7f09012a */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.N;
/* const v1, 0x7f090085 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_6
/* const/16 v1, 0x32 */
/* if-ge v0, v1, :cond_7 */
v0 = this.aO;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "2-"; // const-string v2, "2-"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x18 */
/* sub-int/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
} // :cond_7
/* const/16 v1, 0x4b */
/* if-ge v0, v1, :cond_8 */
v0 = this.aO;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "3-"; // const-string v2, "3-"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x31 */
/* sub-int/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_3 */
} // :cond_8
/* const/16 v1, 0x64 */
/* if-ge v0, v1, :cond_9 */
v0 = this.aO;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "4-"; // const-string v2, "4-"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x4a */
/* sub-int/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_3 */
} // :cond_9
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_4 */
v0 = this.aO;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "5-"; // const-string v2, "5-"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x63 */
/* sub-int/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
/* goto/16 :goto_3 */
} // :cond_a
v0 = this.bp;
/* const v1, 0x7f09026b */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* goto/16 :goto_4 */
/* :sswitch_10 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a;->a(Z)V
v0 = this.L;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = this.L;
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->q()V
} // :cond_b
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_c
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.d .b ( );
} // :cond_c
/* const v0, 0x7f09012b */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_11 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
v0 = this.aa;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.ab;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a;->a(Z)V
v0 = this.L;
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->c()V
/* const v0, 0x7f09012d */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* if-ge v0, v5, :cond_e */
v0 = this.M;
/* const v1, 0x7f0900f2 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_d
} // :goto_5
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->w()V */
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_e
/* const/16 v1, 0x32 */
/* if-ge v0, v1, :cond_f */
v0 = this.M;
/* const v1, 0x7f0900f7 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_f
/* const/16 v1, 0x4b */
/* if-ge v0, v1, :cond_10 */
v0 = this.M;
/* const v1, 0x7f0900fc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_10
/* const/16 v1, 0x64 */
/* if-ge v0, v1, :cond_11 */
v0 = this.M;
/* const v1, 0x7f090101 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_11
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_d */
v0 = this.M;
/* const v1, 0x7f090106 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* :sswitch_12 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
v0 = this.L;
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->b()V
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_12
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.d .b ( );
} // :cond_12
/* const v0, 0x7f09012b */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.L;
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->c()V
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->e()V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_13 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
com.doodle.ltcsmyb.d.f .a ( p0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/d/f;->a()V
/* const v0, 0x7f09012e */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* if-ge v0, v5, :cond_13 */
v0 = this.M;
/* const v1, 0x7f0900f2 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :goto_6
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->w()V */
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_13
/* const/16 v1, 0x32 */
/* if-ge v0, v1, :cond_14 */
v0 = this.M;
/* const v1, 0x7f0900f7 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_14
/* const/16 v1, 0x4b */
/* if-ge v0, v1, :cond_15 */
v0 = this.M;
/* const v1, 0x7f0900fc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
} // :cond_15
v0 = this.M;
/* const v1, 0x7f090101 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
/* :sswitch_14 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
com.doodle.ltcsmyb.d.f .a ( p0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/d/f;->a()V
/* const v0, 0x7f09012e */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->e()V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_15 */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
com.doodle.ltcsmyb.d.f .a ( p0 );
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/d/f;->a()V
/* const v0, 0x7f09012e */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
v0 = this.L;
v0 = this.a;
v0 = (( com.doodle.ltcsmyb.c.b ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->g()I
/* if-eq v0, v5, :cond_17 */
/* const/16 v1, 0x4b */
/* if-eq v0, v1, :cond_17 */
/* const/16 v1, 0x32 */
/* if-eq v0, v1, :cond_17 */
/* const/16 v1, 0x64 */
/* if-eq v0, v1, :cond_17 */
/* const/16 v1, 0x7d */
/* if-eq v0, v1, :cond_17 */
v0 = this.L;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_16
v0 = this.a;
(( com.doodle.ltcsmyb.c.b ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/c/b;->e()V
} // :cond_16
/* add-int/lit8 v0, v0, 0x1 */
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_17
/* const v1, 0x7f0900aa */
/* invoke-direct {p0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* if-ne v0, v5, :cond_19 */
/* const v0, 0x7f0900f5 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->d()Z
/* if-nez v0, :cond_18 */
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->m()V
/* const v0, 0x7f09012f */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_18
} // :goto_7
v0 = this.cR;
(( com.doodle.ltcsmyb.TvPanel ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/TvPanel;->a()V
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_19
/* const/16 v1, 0x32 */
/* if-ne v0, v1, :cond_1a */
/* const v0, 0x7f0900fa */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->e()Z
/* if-nez v0, :cond_18 */
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->o()V
/* const v0, 0x7f09012f */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_1a
/* const/16 v1, 0x4b */
/* if-ne v0, v1, :cond_1b */
/* const v0, 0x7f0900ff */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->f()Z
/* if-nez v0, :cond_18 */
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->n()V
/* const v0, 0x7f09012f */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_1b
/* const/16 v1, 0x64 */
/* if-ne v0, v1, :cond_1c */
/* const v0, 0x7f090104 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_1c
/* const/16 v1, 0x7d */
/* if-ne v0, v1, :cond_18 */
/* const v0, 0x7f090108 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_16 */
v0 = this.ba;
v0 = (( com.doodlemobile.basket.ui.Button ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->d()I
/* const v1, 0x7f09010d */
/* if-ne v0, v1, :cond_1d */
v0 = this.ba;
/* const v1, 0x7f090269 */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a/a;->a(Z)V
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_1d
v0 = this.ba;
/* const v1, 0x7f09010d */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a/a;->a(Z)V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_17 */
v0 = this.aZ;
v0 = (( com.doodlemobile.basket.ui.Button ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->d()I
/* const v1, 0x7f09026a */
/* if-ne v0, v1, :cond_1e */
v0 = this.aZ;
/* const v1, 0x7f09010f */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).b ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodle/ltcsmyb/a/a;->b(Z)V
com.doodle.ltcsmyb.d.f .a ( p0 );
final String v1 = "backgroundmenu"; // const-string v1, "backgroundmenu"
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(Ljava/lang/String;)V
/* move v0, v4 */
/* goto/16 :goto_0 */
} // :cond_1e
v0 = this.aZ;
/* const v1, 0x7f09026a */
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
com.doodle.ltcsmyb.a.a .a ( p0 );
(( com.doodle.ltcsmyb.a.a ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a/a;->b(Z)V
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_18 */
final String v0 = "Cheese Tower Reset Game"; // const-string v0, "Cheese Tower Reset Game"
com.flurry.android.FlurryAgent .a ( v0 );
v0 = this.A;
/* const/16 v1, 0x65 */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_19 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->q()I
/* int-to-long v0, v0 */
com.doodle.ltcsmyb.f .a ( v0,v1 );
final String v0 = "Cheese Tower Submit Highscore"; // const-string v0, "Cheese Tower Submit Highscore"
com.flurry.android.FlurryAgent .a ( v0 );
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_1a */
/* const v0, 0x7f090123 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* const v0, 0x7f09012c */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* move v0, v4 */
/* goto/16 :goto_0 */
/* :sswitch_1b */
/* const v0, 0x7f090122 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* const v0, 0x7f09012c */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_1f
/* move v0, v4 */
/* goto/16 :goto_0 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f090079 -> :sswitch_f */
/* 0x7f090089 -> :sswitch_11 */
/* 0x7f09008b -> :sswitch_12 */
/* 0x7f09008d -> :sswitch_3 */
/* 0x7f09008f -> :sswitch_10 */
/* 0x7f090093 -> :sswitch_1a */
/* 0x7f090096 -> :sswitch_1b */
/* 0x7f0900a9 -> :sswitch_14 */
/* 0x7f0900aa -> :sswitch_13 */
/* 0x7f0900ab -> :sswitch_15 */
/* 0x7f0900ae -> :sswitch_1 */
/* 0x7f0900c7 -> :sswitch_6 */
/* 0x7f0900c9 -> :sswitch_5 */
/* 0x7f0900cb -> :sswitch_4 */
/* 0x7f0900cc -> :sswitch_2 */
/* 0x7f0900cd -> :sswitch_0 */
/* 0x7f0900f1 -> :sswitch_7 */
/* 0x7f0900f5 -> :sswitch_a */
/* 0x7f0900fa -> :sswitch_b */
/* 0x7f0900ff -> :sswitch_c */
/* 0x7f090104 -> :sswitch_d */
/* 0x7f090108 -> :sswitch_e */
/* 0x7f09010c -> :sswitch_16 */
/* 0x7f09010e -> :sswitch_17 */
/* 0x7f090110 -> :sswitch_18 */
/* 0x7f090112 -> :sswitch_19 */
/* 0x7f090114 -> :sswitch_8 */
/* 0x7f090116 -> :sswitch_9 */
} // .end sparse-switch
} // .end method
public static Integer r ( ) {
/* .locals 1 */
} // .end method
private void v ( ) {
/* .locals 9 */
java.util.Calendar .getInstance ( );
(( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
v1 = (( java.util.Date ) v1 ).getMinutes ( ); // invoke-virtual {v1}, Ljava/util/Date;->getMinutes()I
(( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
v0 = (( java.util.Date ) v0 ).getHours ( ); // invoke-virtual {v0}, Ljava/util/Date;->getHours()I
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->B()V */
/* rem-int/lit8 v0, v0, 0xc */
/* int-to-float v0, v0 */
/* const/high16 v2, 0x41400000 # 12.0f */
/* div-float/2addr v0, v2 */
/* float-to-double v2, v0 */
/* const-wide v4, 0x400921fb54442d18L # Math.PI */
/* mul-double/2addr v2, v4 */
/* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
/* mul-double/2addr v2, v4 */
/* int-to-float v0, v1 */
/* const/high16 v4, 0x42700000 # 60.0f */
/* div-float/2addr v0, v4 */
/* float-to-double v4, v0 */
/* const-wide v6, 0x400921fb54442d18L # Math.PI */
/* mul-double/2addr v4, v6 */
/* const-wide/high16 v6, 0x4018000000000000L # 6.0 */
/* div-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* double-to-float v0, v2 */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x42700000 # 60.0f */
/* div-float/2addr v1, v2 */
/* float-to-double v1, v1 */
/* const-wide v3, 0x400921fb54442d18L # Math.PI */
/* mul-double/2addr v1, v3 */
/* const-wide/high16 v3, 0x4000000000000000L # 2.0 */
/* mul-double/2addr v1, v3 */
/* double-to-float v1, v1 */
v2 = this.aC;
(( com.doodlemobile.basket.ui.AnimationView ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodlemobile/basket/ui/AnimationView;->a(F)V
v2 = this.av;
/* iget v3, v2, Lcom/doodlemobile/basket/ui/b;->c:F */
/* float-to-double v3, v3 */
/* const-wide/high16 v5, 0x4028000000000000L # 12.0 */
/* float-to-double v7, v0 */
java.lang.Math .sin ( v7,v8 );
/* move-result-wide v7 */
/* mul-double/2addr v5, v7 */
/* add-double/2addr v3, v5 */
/* double-to-float v3, v3 */
/* iput v3, v2, Lcom/doodlemobile/basket/ui/b;->c:F */
v2 = this.av;
/* iget v3, v2, Lcom/doodlemobile/basket/ui/b;->d:F */
/* float-to-double v3, v3 */
/* const-wide/high16 v5, 0x4028000000000000L # 12.0 */
/* float-to-double v7, v0 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* mul-double/2addr v5, v7 */
/* sub-double/2addr v3, v5 */
/* double-to-float v0, v3 */
/* iput v0, v2, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.aD;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(F)V
v0 = this.au;
/* iget v2, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* float-to-double v2, v2 */
/* const-wide/high16 v4, 0x4030000000000000L # 16.0 */
/* float-to-double v6, v1 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
/* double-to-float v2, v2 */
/* iput v2, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.au;
/* iget v2, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* float-to-double v2, v2 */
/* const-wide/high16 v4, 0x4030000000000000L # 16.0 */
/* float-to-double v6, v1 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* mul-double/2addr v4, v6 */
/* sub-double v1, v2, v4 */
/* double-to-float v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
return;
} // .end method
private void w ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.L;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
(( com.doodle.ltcsmyb.c.b ) v1 ).r ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/b;->r()V
} // :cond_0
this.a = v2;
java.lang.System .gc ( );
} // :cond_1
v0 = this.cO;
(( com.doodle.ltcsmyb.j ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/j;->c()V
v0 = this.Q;
this.S = v0;
v0 = this.M;
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/ui/e;Lcom/doodlemobile/basket/s;)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->q()V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->k()V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).l ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->l()V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).m ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->m()V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).n ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->n()V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->j()V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cV:Z */
return;
} // .end method
private void x ( ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
v0 = this.L;
/* if-nez v0, :cond_2 */
/* new-instance v0, Lcom/doodle/ltcsmyb/a; */
v1 = com.doodle.ltcsmyb.MainActivity.n;
v2 = this.N;
/* invoke-direct {v0, v1, v2, p0}, Lcom/doodle/ltcsmyb/a;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/ui/e;Lcom/doodle/ltcsmyb/MainActivity;)V */
this.L = v0;
} // :goto_0
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cS:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cS:Z */
v0 = this.cO;
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/b/a;)V
} // :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
/* iput-boolean v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cX:Z */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.cO;
(( com.doodle.ltcsmyb.j ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/j;->c()V
} // :cond_1
v0 = this.R;
this.S = v0;
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
v0 = this.N;
v1 = this.L;
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/ui/e;Lcom/doodlemobile/basket/s;)V
/* iput-boolean v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->cQ:Z */
return;
} // :cond_2
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->i()V
} // .end method
private void y ( ) {
/* .locals 5 */
int v3 = 0; // const/4 v3, 0x0
final String v4 = " main menu"; // const-string v4, " main menu"
com.doodlemobile.gamecenter.d.d .a ( p0 );
this.a = v0;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = this.d;
final String v1 = "Appear"; // const-string v1, "Appear"
final String v2 = " main menu"; // const-string v2, " main menu"
com.doodlemobile.gamecenter.z .a ( v0,v1,v4 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.a;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " appear "; // const-string v1, " appear "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " main menu"; // const-string v1, " main menu"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.FlurryAgent .d ( v0 );
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.I;
v0 = (( android.graphics.Bitmap ) v0 ).isRecycled ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
/* if-nez v0, :cond_1 */
v0 = this.I;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.I = v0;
v0 = this.a;
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.a;
v0 = this.a;
v1 = this.a;
v1 = this.a;
/* array-length v1, v1 */
android.graphics.BitmapFactory .decodeByteArray ( v0,v3,v1 );
this.I = v0;
} // :cond_2
} // :goto_0
v0 = this.I;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.J;
/* if-nez v0, :cond_5 */
/* new-instance v0, Lcom/doodlemobile/basket/test/b; */
v1 = this.I;
/* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/test/b;-><init>(Landroid/graphics/Bitmap;)V */
this.J = v0;
} // :goto_1
v0 = this.J;
(( com.doodlemobile.basket.test.b ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/test/b;->p()V
v0 = this.ad;
v1 = this.J;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_3
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->d()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
return;
} // :cond_4
v0 = this.a;
v0 = this.b;
com.doodlemobile.gamecenter.f.a .a ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* array-length v1, v0 */
android.graphics.BitmapFactory .decodeByteArray ( v0,v3,v1 );
this.I = v0;
} // :cond_5
v0 = this.J;
v1 = this.I;
(( com.doodlemobile.basket.test.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/test/b;->a(Landroid/graphics/Bitmap;)V
} // .end method
private void z ( ) {
/* .locals 4 */
/* const/16 v3, 0xa */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v3, :cond_0 */
v1 = this.bS;
int v2 = -1; // const/4 v2, -0x1
/* aput v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* move v0, v3 */
} // :goto_1
/* const/16 v1, 0x14 */
/* if-ge v0, v1, :cond_1 */
v1 = this.bS;
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
/* # virtual methods */
public final com.doodlemobile.basket.ui.a.k a ( java.lang.String p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
final String v0 = "Sound"; // const-string v0, "Sound"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Lcom/doodle/ltcsmyb/d/a; */
/* invoke-direct {v0, p2, p0}, Lcom/doodle/ltcsmyb/d/a;-><init>(Landroid/util/AttributeSet;Lcom/doodle/ltcsmyb/MainActivity;)V */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final com.doodlemobile.basket.ui.e a ( java.lang.String p0, Object p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
final String v0 = "TvPanel"; // const-string v0, "TvPanel"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Lcom/doodle/ltcsmyb/TvPanel; */
/* invoke-direct {v0, p2, p3, p0}, Lcom/doodle/ltcsmyb/TvPanel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;Lcom/doodle/ltcsmyb/MainActivity;)V */
this.cR = v0;
v0 = this.cR;
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void a ( ) {
/* .locals 2 */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
v0 = this.a;
v1 = com.doodle.ltcsmyb.MainActivity.n;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).l ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->l()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_0
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 1 */
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
return;
} // .end method
protected final void a ( Long p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
/* const/high16 v6, 0x41700000 # 15.0f */
/* const/high16 v3, -0x3e900000 # -15.0f */
int v5 = 0; // const/4 v5, 0x0
int v4 = 1; // const/4 v4, 0x1
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/GameActivity;->a(J)V */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cV:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cV:Z */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
final String v1 = "backgroundmenu"; // const-string v1, "backgroundmenu"
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(Ljava/lang/String;)V
} // :cond_0
} // :goto_0
v0 = this.d;
v1 = this.M;
/* if-ne v0, v1, :cond_1 */
v0 = this.P;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->g()I
/* sparse-switch v0, :sswitch_data_0 */
} // :cond_1
} // :goto_1
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cQ:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* const v0, 0x7f090124 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cQ:Z */
} // :cond_2
return;
} // :cond_3
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cW:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cW:Z */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.d .b ( );
/* :sswitch_0 */
v0 = this.T;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ag = v0;
v0 = this.ag;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ag;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ag;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_7 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bV:Z */
/* if-nez v0, :cond_4 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bV:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->bW:Z */
} // :cond_4
} // :goto_2
v0 = this.ag;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3d240000 # -110.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_8 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bX:Z */
/* if-nez v0, :cond_5 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bX:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->bY:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
} // :cond_5
} // :goto_3
v0 = this.T;
v1 = this.ag;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bO:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
/* move v0, v5 */
} // :goto_4
int v1 = 5; // const/4 v1, 0x5
/* if-ge v0, v1, :cond_9 */
v1 = this.aw;
/* aget-object v1, v1, v0 */
/* iget v2, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* add-float/2addr v2, v3 */
/* iput v2, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = this.aw;
/* aget-object v1, v1, v0 */
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v2, 0x43f10000 # 482.0f */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_6 */
v1 = this.aw;
/* aget-object v1, v1, v0 */
/* const/high16 v2, -0x3c5f0000 # -322.0f */
/* iput v2, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
} // :cond_6
v1 = this.ay;
/* aget-object v1, v1, v0 */
v2 = this.aw;
/* aget-object v2, v2, v0 */
(( com.doodlemobile.basket.ui.AnimationView ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_7
v0 = this.ag;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_4 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bW:Z */
/* if-nez v0, :cond_4 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bW:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->bV:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bZ:F */
} // :cond_8
v0 = this.ag;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x41200000 # 10.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_5 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bY:Z */
/* if-nez v0, :cond_5 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bY:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->bX:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ca:F */
} // :cond_9
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bQ:Z */
if ( v0 != null) { // if-eqz v0, :cond_e
v0 = this.aj;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x42dc0000 # 110.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_a */
v0 = this.aj;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x41a00000 # 20.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.bd;
v1 = this.aj;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
} // :cond_a
v0 = this.ai;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x433e0000 # 190.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_b */
v0 = this.ai;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x41a00000 # 20.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.be;
v1 = this.ai;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
} // :cond_b
v0 = this.an;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x43af0000 # 350.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_c */
v0 = this.an;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x41a00000 # 20.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.bk;
v1 = this.an;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.ao;
v1 = this.an;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x40800000 # 4.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ad;
v1 = this.ao;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
} // :cond_c
v0 = this.ah;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x43870000 # 270.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_10 */
v0 = this.ah;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x41a00000 # 20.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.bf;
v1 = this.ah;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
} // :cond_d
} // :goto_5
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_11 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
/* const v1, 0x3ccccccd # 0.025f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
} // :goto_6
v0 = this.bi;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
(( com.doodlemobile.basket.ui.Button ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->c(F)V
} // :cond_e
v0 = this.am;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v1, 0x43110000 # 145.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_12 */
v0 = this.am;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v2, 0x40a00000 # 5.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.aA;
v1 = this.am;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
} // :cond_f
} // :goto_7
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bN:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bM:Z */
/* if-nez v0, :cond_14 */
v0 = this.ak;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3c740000 # -280.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_13 */
v0 = this.ak;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x41200000 # 10.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.az;
v1 = this.ak;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_10
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bO:Z */
/* if-nez v0, :cond_d */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bO:Z */
} // :cond_11
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bJ:F */
} // :cond_12
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bN:Z */
/* if-nez v0, :cond_f */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bN:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cT:Z */
if ( v0 != null) { // if-eqz v0, :cond_f
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cT:Z */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v4, :cond_f */
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v1, 0x66 */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_13
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bM:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cU:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cU:Z */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
/* if-ne v0, v4, :cond_1 */
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v1, 0x6c */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_1 */
} // :cond_14
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bT:I */
/* const/16 v1, 0x14 */
/* if-ge v0, v1, :cond_15 */
v0 = this.ak;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v2 = this.bS;
/* iget v3, p0, Lcom/doodle/ltcsmyb/MainActivity;->bT:I */
/* add-int/lit8 v4, v3, 0x1 */
/* iput v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bT:I */
/* aget v2, v2, v3 */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.az;
v1 = this.ak;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_15
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bP:Z */
/* if-nez v0, :cond_16 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bP:Z */
v0 = this.aB;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.aB;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v7 ); // invoke-virtual {v0, v7}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
} // :cond_16
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bU:I */
/* add-int/lit8 v1, v0, 0x1 */
/* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bU:I */
/* const/16 v1, 0x22 */
/* if-ge v0, v1, :cond_17 */
v0 = this.aB;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->bU:I */
/* int-to-float v1, v1 */
/* const v2, 0x3cf5c28f # 0.03f */
/* mul-float/2addr v1, v2 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->c(F)V
/* goto/16 :goto_1 */
} // :cond_17
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->bQ:Z */
/* if-nez v0, :cond_1 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->bQ:Z */
/* goto/16 :goto_1 */
/* :sswitch_1 */
v0 = this.U;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.af = v0;
v0 = this.af;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.af;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.af;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_1a */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cb:Z */
/* if-nez v0, :cond_18 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cb:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cc:Z */
} // :cond_18
} // :goto_8
v0 = this.af;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3db80000 # -50.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1b */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cd:Z */
/* if-nez v0, :cond_19 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cd:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->ce:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
} // :cond_19
} // :goto_9
v0 = this.U;
v1 = this.af;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cL:Z */
if ( v0 != null) { // if-eqz v0, :cond_1d
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* float-to-double v0, v0 */
/* const-wide v2, 0x3fdcb91f3bbba140L # 0.4487989505128276 */
/* cmpg-double v0, v0, v2 */
/* if-gez v0, :cond_1c */
v0 = this.aE;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(F)V
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* float-to-double v0, v0 */
/* const-wide v2, 0x3f757254c2c98977L # 0.005235987755982988 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* goto/16 :goto_1 */
} // :cond_1a
v0 = this.af;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_18 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cc:Z */
/* if-nez v0, :cond_18 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cc:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cb:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cf:F */
} // :cond_1b
v0 = this.af;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, 0x41a00000 # 20.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_19 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ce:Z */
/* if-nez v0, :cond_19 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->ce:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cd:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cg:F */
} // :cond_1c
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cL:Z */
/* goto/16 :goto_1 */
} // :cond_1d
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* float-to-double v0, v0 */
/* const-wide v2, -0x402346e0c4445ec0L # -0.4487989505128276 */
/* cmpl-double v0, v0, v2 */
/* if-lez v0, :cond_1e */
v0 = this.aE;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(F)V
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* float-to-double v0, v0 */
/* const-wide v2, 0x3f757254c2c98977L # 0.005235987755982988 */
/* sub-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cM:F */
/* goto/16 :goto_1 */
} // :cond_1e
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cL:Z */
/* goto/16 :goto_1 */
/* :sswitch_2 */
v0 = this.V;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ap = v0;
v0 = this.ap;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ap;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ap;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_21 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ch:Z */
/* if-nez v0, :cond_1f */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->ch:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->ci:Z */
} // :cond_1f
} // :goto_a
v0 = this.ap;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3dcc0000 # -45.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_22 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cj:Z */
/* if-nez v0, :cond_20 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cj:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->ck:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
} // :cond_20
} // :goto_b
v0 = this.V;
v1 = this.ap;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_21
v0 = this.ap;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_1f */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ci:Z */
/* if-nez v0, :cond_1f */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->ci:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->ch:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cl:F */
} // :cond_22
v0 = this.ap;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* cmpl-float v0, v0, v7 */
/* if-lez v0, :cond_20 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ck:Z */
/* if-nez v0, :cond_20 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->ck:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cj:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cm:F */
/* :sswitch_3 */
v0 = this.W;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.aq = v0;
v0 = this.aq;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.aq;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.aq;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_25 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cn:Z */
/* if-nez v0, :cond_23 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cn:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->co:Z */
} // :cond_23
} // :goto_c
v0 = this.aq;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3db80000 # -50.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_26 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cp:Z */
/* if-nez v0, :cond_24 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cp:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cq:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
} // :cond_24
} // :goto_d
v0 = this.W;
v1 = this.aq;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_25
v0 = this.aq;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_23 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->co:Z */
/* if-nez v0, :cond_23 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->co:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cn:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cr:F */
} // :cond_26
v0 = this.aq;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* cmpl-float v0, v0, v7 */
/* if-lez v0, :cond_24 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cq:Z */
/* if-nez v0, :cond_24 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cq:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cp:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cs:F */
/* :sswitch_4 */
v0 = this.X;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ar = v0;
v0 = this.ar;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ar;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ar;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_29 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->ct:Z */
/* if-nez v0, :cond_27 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->ct:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cu:Z */
} // :cond_27
} // :goto_e
v0 = this.ar;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3da40000 # -55.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2a */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cv:Z */
/* if-nez v0, :cond_28 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cv:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cw:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
} // :cond_28
} // :goto_f
v0 = this.X;
v1 = this.ar;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_29
v0 = this.ar;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_27 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cu:Z */
/* if-nez v0, :cond_27 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cu:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->ct:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cx:F */
} // :cond_2a
v0 = this.ar;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* cmpl-float v0, v0, v7 */
/* if-lez v0, :cond_28 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cw:Z */
/* if-nez v0, :cond_28 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cw:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cv:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cy:F */
/* :sswitch_5 */
v0 = this.Y;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.as = v0;
v0 = this.as;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.as;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.as;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_2d */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cz:Z */
/* if-nez v0, :cond_2b */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cz:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cA:Z */
} // :cond_2b
} // :goto_10
v0 = this.as;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3da40000 # -55.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2e */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cB:Z */
/* if-nez v0, :cond_2c */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cB:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cC:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
} // :cond_2c
} // :goto_11
v0 = this.Y;
v1 = this.as;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_2d
v0 = this.as;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_2b */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cA:Z */
/* if-nez v0, :cond_2b */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cA:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cz:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cD:F */
} // :cond_2e
v0 = this.as;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* cmpl-float v0, v0, v7 */
/* if-lez v0, :cond_2c */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cC:Z */
/* if-nez v0, :cond_2c */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cC:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cB:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cE:F */
/* :sswitch_6 */
v0 = this.Z;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.at = v0;
v0 = this.at;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.at;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.at;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_31 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cF:Z */
/* if-nez v0, :cond_2f */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cF:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cG:Z */
} // :cond_2f
} // :goto_12
v0 = this.at;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v1, -0x3da40000 # -55.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_32 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cH:Z */
/* if-nez v0, :cond_30 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cH:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cI:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
} // :cond_30
} // :goto_13
v0 = this.Z;
v1 = this.at;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* goto/16 :goto_1 */
} // :cond_31
v0 = this.at;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_2f */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cG:Z */
/* if-nez v0, :cond_2f */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cG:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cF:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cJ:F */
} // :cond_32
v0 = this.at;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* cmpl-float v0, v0, v7 */
/* if-lez v0, :cond_30 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cI:Z */
/* if-nez v0, :cond_30 */
/* iput-boolean v4, p0, Lcom/doodle/ltcsmyb/MainActivity;->cI:Z */
/* iput-boolean v5, p0, Lcom/doodle/ltcsmyb/MainActivity;->cH:Z */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cK:F */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f0900bc -> :sswitch_0 */
/* 0x7f0900d0 -> :sswitch_1 */
/* 0x7f0900f2 -> :sswitch_2 */
/* 0x7f0900f7 -> :sswitch_3 */
/* 0x7f0900fc -> :sswitch_4 */
/* 0x7f090101 -> :sswitch_5 */
/* 0x7f090106 -> :sswitch_6 */
} // .end sparse-switch
} // .end method
public final void a ( android.view.KeyEvent p0 ) {
/* .locals 7 */
/* const v6, 0x7f09008f */
/* const v5, 0x7f090085 */
/* const v4, 0x7f090079 */
/* const v3, 0x7f09006c */
int v2 = 4; // const/4 v2, 0x4
v0 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_0 */
v0 = this.d;
v1 = this.M;
/* if-ne v0, v1, :cond_1 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* if-ne v0, v2, :cond_0 */
v0 = this.P;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->g()I
/* sparse-switch v0, :sswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :sswitch_0 */
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
(( com.doodle.ltcsmyb.MainActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->finish()V
/* :sswitch_1 */
/* const v0, 0x7f0900f1 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_2 */
/* const v0, 0x7f090116 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_3 */
/* const v0, 0x7f0900f5 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_4 */
/* const v0, 0x7f0900fa */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_5 */
/* const v0, 0x7f0900ff */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_6 */
/* const v0, 0x7f090104 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_7 */
/* const v0, 0x7f090108 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* :sswitch_8 */
/* const v0, 0x7f090114 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_1
v0 = this.d;
v1 = this.N;
/* if-ne v0, v1, :cond_0 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* if-ne v0, v2, :cond_5 */
v0 = this.P;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->g()I
/* if-ne v0, v5, :cond_2 */
/* invoke-direct {p0, v6}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_2
/* const v1, 0x7f090098 */
/* if-eq v0, v1, :cond_0 */
/* if-ne v0, v3, :cond_3 */
/* invoke-direct {p0, v4}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_3
/* const v1, 0x7f090092 */
/* if-ne v0, v1, :cond_4 */
/* const v0, 0x7f090093 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_4
/* const v1, 0x7f090095 */
/* if-ne v0, v1, :cond_0 */
/* const v0, 0x7f090096 */
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
} // :cond_5
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v1, 0x52 */
/* if-ne v0, v1, :cond_0 */
v0 = this.P;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->g()I
/* if-ne v0, v5, :cond_6 */
/* invoke-direct {p0, v6}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* goto/16 :goto_0 */
} // :cond_6
/* if-ne v0, v3, :cond_0 */
/* invoke-direct {p0, v4}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
/* goto/16 :goto_0 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f0900bc -> :sswitch_0 */
/* 0x7f0900d0 -> :sswitch_1 */
/* 0x7f0900f2 -> :sswitch_3 */
/* 0x7f0900f7 -> :sswitch_4 */
/* 0x7f0900fc -> :sswitch_5 */
/* 0x7f090101 -> :sswitch_6 */
/* 0x7f090106 -> :sswitch_7 */
/* 0x7f09010a -> :sswitch_8 */
/* 0x7f090115 -> :sswitch_2 */
} // .end sparse-switch
} // .end method
public final void a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 8 */
/* const v7, 0x46180400 # 9729.0f */
/* const/high16 v4, 0x43f00000 # 480.0f */
/* const/16 v3, 0x1e0 */
/* const/high16 v6, 0x3f800000 # 1.0f */
int v5 = 0; // const/4 v5, 0x0
final String v0 = "Basket"; // const-string v0, "Basket"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Actual size: w="; // const-string v2, "Actual size: w="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", h="; // const-string v2, ", h="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* const/16 v0, 0x320 */
/* invoke-super {p0, p1, v3, v0}, Lcom/doodlemobile/basket/GameActivity;->a(Lcom/doodlemobile/basket/opengl/m;II)V */
int v0 = 0; // const/4 v0, 0x0
/* mul-int/lit8 v0, p2, 0x5 */
/* mul-int/lit8 v1, p3, 0x3 */
/* if-le v0, v1, :cond_0 */
/* mul-int/lit8 v0, p3, 0x3 */
/* div-int/lit8 v0, v0, 0x5 */
/* sub-int v1, p2, v0 */
/* const/16 v2, 0x320 */
/* if-eq p3, v2, :cond_5 */
/* const/high16 v2, 0x44480000 # 800.0f */
/* int-to-float v3, p3 */
/* div-float/2addr v2, v3 */
} // :goto_0
/* div-int/lit8 v3, v1, 0x2 */
/* int-to-float v3, v3 */
/* neg-float v4, v2 */
/* mul-float/2addr v3, v4 */
/* div-int/lit8 v1, v1, 0x2 */
/* move v0, v2 */
} // :goto_1
/* cmpl-float v1, v0, v6 */
if ( v1 != null) { // if-eqz v1, :cond_2
} // :goto_2
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2801 */
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2800 */
return;
} // :cond_0
/* mul-int/lit8 v0, p2, 0x5 */
/* mul-int/lit8 v1, p3, 0x3 */
/* if-ge v0, v1, :cond_1 */
/* mul-int/lit8 v0, p2, 0x5 */
/* div-int/lit8 v0, v0, 0x3 */
/* sub-int v1, p3, v0 */
/* if-eq p2, v3, :cond_4 */
/* int-to-float v2, p2 */
/* div-float v2, v4, v2 */
} // :goto_3
/* div-int/lit8 v3, v1, 0x2 */
/* int-to-float v3, v3 */
/* neg-float v4, v2 */
/* mul-float/2addr v3, v4 */
/* div-int/lit8 v1, v1, 0x2 */
/* move v0, v2 */
} // :cond_1
/* if-eq p2, v3, :cond_3 */
/* int-to-float v0, p2 */
/* div-float v0, v4, v0 */
} // :goto_4
} // :cond_2
} // :cond_3
/* move v0, v6 */
} // :cond_4
/* move v2, v6 */
} // :cond_5
/* move v2, v6 */
} // .end method
public final void a ( com.doodlemobile.basket.ui.Button p0 ) {
/* .locals 4 */
/* const v3, 0x3f8ccccd # 1.1f */
v0 = (( com.doodlemobile.basket.ui.Button ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/Button;->g()I
/* sparse-switch v0, :sswitch_data_0 */
/* invoke-direct {p0, p1, v3}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/ui/Button;F)V */
} // :goto_0
return;
/* :sswitch_0 */
v0 = this.bd;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_1 */
v0 = this.be;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_2 */
v0 = this.bk;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ao = v0;
v0 = this.ao;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v2, 0x41300000 # 11.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ad;
v1 = this.ao;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).b_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->b_(F)V
/* :sswitch_3 */
v0 = this.bf;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_4 */
v0 = this.aW;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_5 */
v0 = this.bj;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_6 */
v0 = this.bq;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_7 */
v0 = this.br;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_8 */
v0 = this.bs;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_9 */
v0 = this.bt;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_a */
v0 = this.bu;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_b */
v0 = this.ba;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_c */
v0 = this.aZ;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_d */
v0 = this.bb;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_e */
v0 = this.bc;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_f */
v0 = this.bh;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_10 */
v0 = this.bm;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_11 */
v0 = this.bn;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_12 */
v0 = this.bo;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_13 */
v0 = this.bp;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_14 */
v0 = this.aT;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_15 */
v0 = this.aV;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_16 */
v0 = this.aU;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f090079 -> :sswitch_f */
/* 0x7f090089 -> :sswitch_12 */
/* 0x7f09008b -> :sswitch_11 */
/* 0x7f09008d -> :sswitch_13 */
/* 0x7f09008f -> :sswitch_10 */
/* 0x7f0900a9 -> :sswitch_16 */
/* 0x7f0900aa -> :sswitch_14 */
/* 0x7f0900ab -> :sswitch_15 */
/* 0x7f0900c7 -> :sswitch_3 */
/* 0x7f0900c9 -> :sswitch_1 */
/* 0x7f0900cb -> :sswitch_0 */
/* 0x7f0900cd -> :sswitch_2 */
/* 0x7f0900f5 -> :sswitch_6 */
/* 0x7f0900fa -> :sswitch_7 */
/* 0x7f0900ff -> :sswitch_8 */
/* 0x7f090104 -> :sswitch_9 */
/* 0x7f090108 -> :sswitch_a */
/* 0x7f09010c -> :sswitch_b */
/* 0x7f09010e -> :sswitch_c */
/* 0x7f090110 -> :sswitch_d */
/* 0x7f090112 -> :sswitch_e */
/* 0x7f090114 -> :sswitch_4 */
/* 0x7f090116 -> :sswitch_5 */
} // .end sparse-switch
} // .end method
protected final void a ( Object p0 ) {
/* .locals 6 */
/* const/16 v5, 0x69 */
/* const v4, 0x7f090117 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = (( com.doodlemobile.basket.ui.a.p ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/a/p;->e()I
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bG:Z */
/* const v1, 0x7f090128 */
/* if-ne v0, v1, :cond_2 */
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodle/ltcsmyb/a;->a(Z)V
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->f()V
} // :cond_0
} // :goto_0
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* if-nez v0, :cond_19 */
v0 = this.P;
/* iput-boolean v2, v0, Lcom/doodlemobile/basket/ui/UIViewGroup;->s:Z */
} // :cond_1
} // :goto_1
return;
} // :cond_2
/* const v1, 0x7f09012c */
/* if-ne v0, v1, :cond_3 */
v1 = this.L;
(( com.doodle.ltcsmyb.a ) v1 ).i ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodle/ltcsmyb/a;->i(I)V
v0 = this.aa;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.ab;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v5 ); // invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
} // :cond_3
/* const v1, 0x7f09012a */
/* if-ne v0, v1, :cond_4 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bG:Z */
v0 = this.A;
(( android.os.Handler ) v0 ).sendEmptyMessage ( v5 ); // invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z
} // :cond_4
/* const v1, 0x7f090124 */
/* if-ne v0, v1, :cond_6 */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cX:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->cX:Z */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_5
com.doodle.ltcsmyb.d.f .a ( p0 );
final String v1 = "background"; // const-string v1, "background"
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(Ljava/lang/String;)V
} // :cond_5
/* rem-int/lit8 v0, v0, 0x7d */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v3, :cond_0 */
v0 = this.aa;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.ab;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_6
/* const v1, 0x7f090129 */
/* if-ne v0, v1, :cond_7 */
/* rem-int/lit8 v0, v0, 0x7d */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v3, :cond_0 */
v0 = this.aa;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
v0 = this.ab;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
} // :cond_7
/* if-ne v0, v4, :cond_8 */
v0 = this.L;
(( com.doodle.ltcsmyb.a ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a;->n()Lcom/badlogic/gdx/physics/box2d/World;
v0 = (( com.badlogic.gdx.physics.box2d.World ) v0 ).getBodyCount ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/physics/box2d/World;->getBodyCount()I
/* const/16 v1, 0xb */
/* if-ne v0, v1, :cond_0 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lcom/doodle/ltcsmyb/MainActivity;->c(I)V
/* goto/16 :goto_1 */
} // :cond_8
/* const v1, 0x7f090131 */
/* if-ne v0, v1, :cond_9 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bv:Z */
/* goto/16 :goto_0 */
} // :cond_9
/* const v1, 0x7f090134 */
/* if-ne v0, v1, :cond_a */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bw:Z */
/* goto/16 :goto_0 */
} // :cond_a
/* const v1, 0x7f09013b */
/* if-ne v0, v1, :cond_b */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* goto/16 :goto_0 */
} // :cond_b
/* const v1, 0x7f090133 */
/* if-ne v0, v1, :cond_c */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bF:Z */
/* goto/16 :goto_0 */
} // :cond_c
/* const v1, 0x7f090132 */
/* if-ne v0, v1, :cond_d */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bx:Z */
/* goto/16 :goto_0 */
} // :cond_d
/* const v1, 0x7f09013c */
/* if-ne v0, v1, :cond_e */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* goto/16 :goto_0 */
} // :cond_e
/* const v1, 0x7f09013e */
/* if-ne v0, v1, :cond_f */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* goto/16 :goto_0 */
} // :cond_f
/* const v1, 0x7f090140 */
/* if-ne v0, v1, :cond_10 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* goto/16 :goto_0 */
} // :cond_10
/* const v1, 0x7f090142 */
/* if-ne v0, v1, :cond_11 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->by:Z */
/* goto/16 :goto_0 */
} // :cond_11
/* const v1, 0x7f09013d */
/* if-ne v0, v1, :cond_12 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bz:Z */
/* goto/16 :goto_0 */
} // :cond_12
/* const v1, 0x7f09013f */
/* if-ne v0, v1, :cond_13 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bA:Z */
/* goto/16 :goto_0 */
} // :cond_13
/* const v1, 0x7f090141 */
/* if-ne v0, v1, :cond_14 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bB:Z */
/* goto/16 :goto_0 */
} // :cond_14
/* const v1, 0x7f090145 */
/* if-ne v0, v1, :cond_15 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bC:Z */
/* goto/16 :goto_0 */
} // :cond_15
/* const v1, 0x7f090144 */
/* if-ne v0, v1, :cond_16 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bD:Z */
/* goto/16 :goto_0 */
} // :cond_16
/* const v1, 0x7f090135 */
/* if-ne v0, v1, :cond_17 */
/* iput-boolean v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->bE:Z */
/* goto/16 :goto_0 */
} // :cond_17
/* const v1, 0x7f09012f */
/* if-ne v0, v1, :cond_18 */
v0 = this.cR;
(( com.doodle.ltcsmyb.TvPanel ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/TvPanel;->d()V
/* goto/16 :goto_0 */
} // :cond_18
/* const v1, 0x7f09011b */
/* if-ne v0, v1, :cond_0 */
/* const/16 v1, 0x63 */
/* if-ne v0, v1, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v1, 0x77 */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
/* goto/16 :goto_0 */
} // :cond_19
v0 = this.F;
/* aget v0, v0, v2 */
v1 = this.H;
/* aget-object v1, v1, v2 */
this.S = v1;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* sub-int/2addr v1, v3 */
/* iput v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* move v1, v2 */
} // :goto_2
/* iget v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* if-ge v1, v2, :cond_1a */
v2 = this.F;
v3 = this.F;
/* add-int/lit8 v4, v1, 0x1 */
/* aget v3, v3, v4 */
/* aput v3, v2, v1 */
v2 = this.H;
v3 = this.H;
/* add-int/lit8 v4, v1, 0x1 */
/* aget-object v3, v3, v4 */
/* aput-object v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1a
v1 = this.S;
(( com.doodlemobile.basket.ui.a.j ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/a/j;->a(I)Lcom/doodlemobile/basket/ui/a/p;
this.g = v0;
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.g;
(( com.doodlemobile.basket.ui.a.p ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->b()V
/* goto/16 :goto_1 */
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
v0 = this.bl;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/Button;->a(Z)V
return;
} // .end method
public final void b ( ) {
/* .locals 2 */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
v0 = this.a;
v1 = com.doodle.ltcsmyb.MainActivity.n;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).m ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->m()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_0
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 1 */
v0 = this.N;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
return;
} // .end method
public final void b ( com.doodlemobile.basket.ui.Button p0 ) {
/* .locals 8 */
/* const/16 v7, 0x64 */
/* const/16 v6, 0x4b */
/* const/16 v5, 0x32 */
/* const/16 v4, 0x19 */
/* const/high16 v3, 0x3f800000 # 1.0f */
v0 = (( com.doodlemobile.basket.ui.Button ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/Button;->g()I
/* sparse-switch v0, :sswitch_data_0 */
v0 = this.bd;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
v0 = this.be;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
v0 = this.bf;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
v0 = this.bk;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* invoke-direct {p0, p1, v3}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/ui/Button;F)V */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_1 */
v1 = (( com.doodlemobile.basket.ui.Button ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/Button;->g()I
v2 = this.aS;
/* aget-object v2, v2, v0 */
v2 = (( com.doodlemobile.basket.ui.Button ) v2 ).g ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/ui/Button;->g()I
/* if-ne v1, v2, :cond_b */
/* if-ge v0, v4, :cond_2 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->a()V
} // :cond_0
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_8
/* if-eq v0, v4, :cond_8 */
/* if-eq v0, v5, :cond_8 */
/* if-eq v0, v6, :cond_8 */
/* if-eq v0, v7, :cond_8 */
com.doodle.ltcsmyb.a.a .a ( p0 );
int v2 = 1; // const/4 v2, 0x1
/* sub-int v2, v0, v2 */
v1 = (( com.doodle.ltcsmyb.a.a ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* if-gtz v1, :cond_6 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_1
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v1, 0x76 */
(( com.doodle.ltcsmyb.d.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_1
} // :goto_3
v0 = (( com.doodlemobile.basket.ui.Button ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/ui/Button;->g()I
/* invoke-direct {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->d(I)V */
return;
/* :sswitch_0 */
v0 = this.bd;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_1 */
v0 = this.be;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_2 */
v0 = this.bk;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ao = v0;
v0 = this.ao;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v2, 0x41300000 # 11.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ad;
v1 = this.ao;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).b_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/ImageView;->b_(F)V
/* :sswitch_3 */
v0 = this.bf;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* :sswitch_4 */
v0 = this.aW;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_5 */
v0 = this.bj;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_6 */
v0 = this.bq;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_7 */
v0 = this.br;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_8 */
v0 = this.bs;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_9 */
v0 = this.bt;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_a */
v0 = this.bu;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_b */
v0 = this.ba;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_c */
v0 = this.aZ;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_d */
v0 = this.bb;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_e */
v0 = this.bc;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_f */
v0 = this.bh;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_10 */
v0 = this.bm;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_11 */
v0 = this.bn;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_12 */
v0 = this.bo;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_13 */
v0 = this.bp;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_14 */
v0 = this.aT;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_15 */
v0 = this.aV;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
/* :sswitch_16 */
v0 = this.aU;
(( com.doodlemobile.basket.ui.Button ) v0 ).a_ ( v3 ); // invoke-virtual {v0, v3}, Lcom/doodlemobile/basket/ui/Button;->a_(F)V
/* goto/16 :goto_0 */
} // :cond_2
/* if-ge v0, v5, :cond_3 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->b()V
/* goto/16 :goto_2 */
} // :cond_3
/* if-ge v0, v6, :cond_4 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->c()V
/* goto/16 :goto_2 */
} // :cond_4
/* if-ge v0, v7, :cond_5 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->d()V
/* goto/16 :goto_2 */
} // :cond_5
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_0 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->e()V
/* goto/16 :goto_2 */
} // :cond_6
com.doodle.ltcsmyb.a.a .a ( p0 );
v1 = (( com.doodle.ltcsmyb.a.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_7
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v2, 0x6b */
(( com.doodle.ltcsmyb.d.f ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_7
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->x()V */
/* goto/16 :goto_3 */
} // :cond_8
com.doodle.ltcsmyb.a.a .a ( p0 );
v1 = (( com.doodle.ltcsmyb.a.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/a/a;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_9
com.doodle.ltcsmyb.d.f .a ( p0 );
/* const/16 v2, 0x6b */
(( com.doodle.ltcsmyb.d.f ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodle/ltcsmyb/d/f;->a(I)V
} // :cond_9
/* if-nez v0, :cond_a */
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.f .b ( );
v0 = this.A;
/* const/16 v1, 0x66 */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
/* goto/16 :goto_3 */
} // :cond_a
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->x()V */
/* goto/16 :goto_3 */
} // :cond_b
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_1 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x7f090079 -> :sswitch_f */
/* 0x7f090089 -> :sswitch_12 */
/* 0x7f09008b -> :sswitch_11 */
/* 0x7f09008d -> :sswitch_13 */
/* 0x7f09008f -> :sswitch_10 */
/* 0x7f0900a9 -> :sswitch_16 */
/* 0x7f0900aa -> :sswitch_14 */
/* 0x7f0900ab -> :sswitch_15 */
/* 0x7f0900c7 -> :sswitch_3 */
/* 0x7f0900c9 -> :sswitch_1 */
/* 0x7f0900cb -> :sswitch_0 */
/* 0x7f0900cd -> :sswitch_2 */
/* 0x7f0900f5 -> :sswitch_6 */
/* 0x7f0900fa -> :sswitch_7 */
/* 0x7f0900ff -> :sswitch_8 */
/* 0x7f090104 -> :sswitch_9 */
/* 0x7f090108 -> :sswitch_a */
/* 0x7f09010c -> :sswitch_b */
/* 0x7f09010e -> :sswitch_c */
/* 0x7f090110 -> :sswitch_d */
/* 0x7f090112 -> :sswitch_e */
/* 0x7f090114 -> :sswitch_4 */
/* 0x7f090116 -> :sswitch_5 */
} // .end sparse-switch
} // .end method
public final void c ( ) {
/* .locals 2 */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
v0 = this.a;
v1 = com.doodle.ltcsmyb.MainActivity.n;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).n ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->n()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_0
return;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 3 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* const/16 v1, 0x13 */
/* if-le v0, v1, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.H;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
v2 = this.S;
/* aput-object v2, v0, v1 */
v0 = this.F;
/* iget v1, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
/* aput p1, v0, v1 */
} // :cond_2
v0 = this.S;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.S;
(( com.doodlemobile.basket.ui.a.j ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/ui/a/j;->a(I)Lcom/doodlemobile/basket/ui/a/p;
this.g = v0;
} // :cond_3
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
(( com.doodlemobile.basket.ui.a.p ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->b()V
} // .end method
public final void d ( ) {
/* .locals 2 */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
v0 = this.a;
v1 = com.doodle.ltcsmyb.MainActivity.n;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).o ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->o()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_0
return;
} // .end method
public final void e ( ) {
/* .locals 2 */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
v0 = this.a;
v1 = com.doodle.ltcsmyb.MainActivity.n;
com.doodle.ltcsmyb.c.c .a ( v1 );
(( com.doodle.ltcsmyb.c.c ) v1 ).p ( ); // invoke-virtual {v1}, Lcom/doodle/ltcsmyb/c/c;->p()Lcom/doodlemobile/basket/graphics/e;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/graphics/e;)V
} // :cond_0
return;
} // .end method
public final void f ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->G:I */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
(( com.doodlemobile.basket.ui.a.p ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->d()V
v0 = this.g;
(( com.doodlemobile.basket.ui.a.p ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/a/p;->c()V
int v0 = 0; // const/4 v0, 0x0
this.g = v0;
} // :cond_0
return;
} // .end method
public final void g ( ) {
/* .locals 9 */
/* const v8, 0x7f0900cd */
/* const v7, 0x7f040002 */
int v6 = 0; // const/4 v6, 0x0
/* new-instance v0, Lcom/doodlemobile/basket/ui/g; */
v1 = com.doodle.ltcsmyb.MainActivity.n;
/* invoke-direct {v0, v1, p0}, Lcom/doodlemobile/basket/ui/g;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/ui/c;)V */
/* new-instance v1, Lcom/doodlemobile/basket/ui/a/q; */
v2 = com.doodle.ltcsmyb.MainActivity.n;
/* invoke-direct {v1, v2, p0}, Lcom/doodlemobile/basket/ui/a/q;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/ui/a/d;)V */
v2 = com.doodle.ltcsmyb.MainActivity.n;
/* const/high16 v3, 0x7f040000 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* new-instance v3, Lcom/doodle/ltcsmyb/b; */
(( com.doodlemobile.basket.ui.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/e;
/* invoke-direct {v3, v2, p0}, Lcom/doodle/ltcsmyb/b;-><init>(Lcom/doodlemobile/basket/ui/e;Lcom/doodle/ltcsmyb/MainActivity;)V */
this.cP = v3;
} // :cond_0
v2 = com.doodle.ltcsmyb.MainActivity.n;
if ( v2 != null) { // if-eqz v2, :cond_1
/* new-instance v3, Lcom/doodle/ltcsmyb/j; */
(( com.doodlemobile.basket.ui.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/e;
/* invoke-direct {v3, v2, p0}, Lcom/doodle/ltcsmyb/j;-><init>(Lcom/doodlemobile/basket/ui/e;Lcom/doodle/ltcsmyb/MainActivity;)V */
this.cO = v3;
} // :cond_1
com.doodlemobile.basket.n .c ( );
v2 = this.cP;
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/b/a;)V
v2 = this.A;
/* const/16 v3, 0x6c */
/* const-wide/16 v4, 0x7d0 */
(( android.os.Handler ) v2 ).sendEmptyMessageDelayed ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
v2 = com.doodle.ltcsmyb.MainActivity.n;
/* const v3, 0x7f040003 */
(( com.doodlemobile.basket.ui.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/e;
this.M = v2;
v2 = com.doodle.ltcsmyb.MainActivity.n;
/* const v3, 0x7f040001 */
(( com.doodlemobile.basket.ui.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/e;
this.N = v2;
v2 = com.doodle.ltcsmyb.MainActivity.n;
(( com.doodlemobile.basket.ui.g ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/g;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/e;
this.O = v0;
v0 = this.O;
/* const v2, 0x7f0900af */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.bI = v0;
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v2, 0x7f040005 */
(( com.doodlemobile.basket.ui.a.q ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/a/q;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/a/j;
this.Q = v0;
v0 = this.Q;
v2 = this.M;
(( com.doodlemobile.basket.ui.a.j ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/a/j;->a(Lcom/doodlemobile/basket/ui/e;)V
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v2, 0x7f040004 */
(( com.doodlemobile.basket.ui.a.q ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/doodlemobile/basket/ui/a/q;->a(Lorg/xmlpull/v1/XmlPullParser;)Lcom/doodlemobile/basket/ui/a/j;
this.R = v0;
v0 = this.R;
v1 = this.N;
(( com.doodlemobile.basket.ui.a.j ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/a/j;->a(Lcom/doodlemobile/basket/ui/e;)V
v0 = this.M;
/* const v1, 0x7f0900c5 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.T = v0;
v0 = this.M;
/* const v1, 0x7f0900d1 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.U = v0;
v0 = this.M;
/* const v1, 0x7f0900f3 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.V = v0;
v0 = this.M;
/* const v1, 0x7f0900f8 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.W = v0;
v0 = this.M;
/* const v1, 0x7f0900fd */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.X = v0;
v0 = this.M;
/* const v1, 0x7f090102 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.Y = v0;
v0 = this.M;
/* const v1, 0x7f090107 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.Z = v0;
v0 = this.N;
/* const v1, 0x7f090077 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.aa = v0;
v0 = this.N;
/* const v1, 0x7f090078 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.ab = v0;
v0 = this.M;
/* const v1, 0x7f0900f0 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.ac = v0;
v0 = this.M;
/* const v1, 0x7f0900cf */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/ImageView; */
this.ad = v0;
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v8 ); // invoke-virtual {v0, v8}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.ae = v0;
com.doodle.ltcsmyb.a.a .a ( p0 );
v0 = (( com.doodle.ltcsmyb.a.a ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/a/a;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.ac;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
} // :cond_2
/* move v1, v6 */
} // :goto_0
int v0 = 5; // const/4 v0, 0x5
/* if-ge v1, v0, :cond_3 */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->getResources()Landroid/content/res/Resources;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "mouseshadow"; // const-string v3, "mouseshadow"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v1, 0x1 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "id"; // const-string v3, "id"
(( com.doodle.ltcsmyb.MainActivity ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->getPackageName()Ljava/lang/String;
v0 = (( android.content.res.Resources ) v0 ).getIdentifier ( v2, v3, v4 ); // invoke-virtual {v0, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
v2 = this.ay;
v3 = this.M;
(( com.doodlemobile.basket.ui.e ) v3 ).b ( v0 ); // invoke-virtual {v3, v0}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
/* aput-object v0, v2, v1 */
v0 = this.aw;
v2 = this.ay;
/* aget-object v2, v2, v1 */
(( com.doodlemobile.basket.ui.AnimationView ) v2 ).s ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
/* aput-object v2, v0, v1 */
v0 = this.aw;
/* aget-object v0, v0, v1 */
int v2 = 2; // const/4 v2, 0x2
/* sub-int v2, v1, v2 */
/* mul-int/lit16 v2, v2, 0xa1 */
/* const/16 v3, 0x280 */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iput v2, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.ay;
/* aget-object v0, v0, v1 */
v2 = this.aw;
/* aget-object v2, v2, v1 */
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_3
v0 = this.M;
/* const v1, 0x7f0900c9 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.be = v0;
v0 = this.M;
/* const v1, 0x7f0900c7 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bf = v0;
v0 = this.M;
/* const v1, 0x7f0900cb */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bd = v0;
v0 = this.M;
/* const v1, 0x7f0900cc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bi = v0;
v0 = this.M;
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v8 ); // invoke-virtual {v0, v8}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bk = v0;
v0 = this.M;
/* const v1, 0x7f0900f1 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bg = v0;
v0 = this.M;
/* const v1, 0x7f090116 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bj = v0;
v0 = this.M;
/* const v1, 0x7f0900f5 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bq = v0;
v0 = this.M;
/* const v1, 0x7f0900fa */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.br = v0;
v0 = this.M;
/* const v1, 0x7f0900ff */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bs = v0;
v0 = this.M;
/* const v1, 0x7f090104 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bt = v0;
v0 = this.M;
/* const v1, 0x7f090108 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bu = v0;
v0 = this.M;
/* const v1, 0x7f090114 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aW = v0;
v0 = this.M;
/* const v1, 0x7f09010c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.ba = v0;
v0 = this.M;
/* const v1, 0x7f09010e */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aZ = v0;
v0 = this.M;
/* const v1, 0x7f090110 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bb = v0;
v0 = this.M;
/* const v1, 0x7f090112 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bc = v0;
v0 = this.N;
/* const v1, 0x7f090079 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bh = v0;
v0 = this.N;
/* const v1, 0x7f09008f */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bm = v0;
v0 = this.N;
/* const v1, 0x7f09008b */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bn = v0;
v0 = this.N;
/* const v1, 0x7f090089 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bo = v0;
v0 = this.N;
/* const v1, 0x7f09008d */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bp = v0;
v0 = this.N;
/* const v1, 0x7f0900ae */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.bl = v0;
v0 = this.N;
/* const v1, 0x7f0900aa */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aT = v0;
v0 = this.N;
/* const v1, 0x7f0900a9 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aU = v0;
v0 = this.N;
/* const v1, 0x7f0900ab */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aV = v0;
v0 = this.N;
/* const v1, 0x7f090093 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aX = v0;
v0 = this.N;
/* const v1, 0x7f090096 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/Button; */
this.aY = v0;
v0 = this.aZ;
this.q = p0;
v0 = this.ba;
this.q = p0;
v0 = this.bb;
this.q = p0;
v0 = this.bc;
this.q = p0;
v0 = this.aX;
this.q = p0;
v0 = this.aY;
this.q = p0;
v0 = this.aT;
this.q = p0;
v0 = this.aU;
this.q = p0;
v0 = this.aV;
this.q = p0;
v0 = this.aW;
this.q = p0;
v0 = this.bm;
this.q = p0;
v0 = this.bn;
this.q = p0;
v0 = this.bo;
this.q = p0;
v0 = this.bp;
this.q = p0;
v0 = this.bh;
this.q = p0;
v0 = this.be;
this.q = p0;
v0 = this.bf;
this.q = p0;
v0 = this.bd;
this.q = p0;
v0 = this.bi;
this.q = p0;
v0 = this.bl;
this.q = p0;
v0 = this.bg;
this.q = p0;
v0 = this.bj;
this.q = p0;
v0 = this.bq;
this.q = p0;
v0 = this.br;
this.q = p0;
v0 = this.bs;
this.q = p0;
v0 = this.bt;
this.q = p0;
v0 = this.bu;
this.q = p0;
v0 = this.ae;
this.q = p0;
v0 = this.bd;
(( com.doodlemobile.basket.ui.Button ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->s()Lcom/doodlemobile/basket/ui/b;
this.aj = v0;
v0 = this.be;
(( com.doodlemobile.basket.ui.Button ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->s()Lcom/doodlemobile/basket/ui/b;
this.ai = v0;
v0 = this.bf;
(( com.doodlemobile.basket.ui.Button ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->s()Lcom/doodlemobile/basket/ui/b;
this.ah = v0;
v0 = this.bk;
(( com.doodlemobile.basket.ui.Button ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/Button;->s()Lcom/doodlemobile/basket/ui/b;
this.an = v0;
v0 = this.ad;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/ImageView;->s()Lcom/doodlemobile/basket/ui/b;
this.ao = v0;
v0 = this.aj;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x43e10000 # 450.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ai;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const v2, 0x44188000 # 610.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.an;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const v2, 0x44638000 # 910.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ah;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const v2, 0x443b8000 # 750.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ao;
v1 = this.an;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->d:F */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.bd;
v1 = this.aj;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.be;
v1 = this.ai;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.bf;
v1 = this.ah;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.bk;
v1 = this.an;
(( com.doodlemobile.basket.ui.Button ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.ad;
v1 = this.ao;
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.bi;
int v1 = 0; // const/4 v1, 0x0
(( com.doodlemobile.basket.ui.Button ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/Button;->c(F)V
v0 = this.M;
/* const v1, 0x7f0900b1 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.az = v0;
v0 = this.M;
/* const v1, 0x7f0900c3 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aB = v0;
v0 = this.M;
/* const v1, 0x7f0900c4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aA = v0;
v0 = this.aA;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.am = v0;
v0 = this.aB;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.al = v0;
v0 = this.az;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.ak = v0;
v0 = this.al;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x43200000 # 160.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.ak;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x44160000 # 600.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.am;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
/* const/high16 v2, 0x42aa0000 # 85.0f */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->d:F */
v0 = this.am;
/* iget v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const v2, 0x43d98000 # 435.0f */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = this.aB;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
v0 = this.aA;
v1 = this.am;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.aB;
v1 = this.al;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
v0 = this.az;
v1 = this.ak;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Lcom/doodlemobile/basket/ui/b;)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->z()V */
v0 = this.M;
/* const v1, 0x7f0900e3 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aC = v0;
v0 = this.M;
/* const v1, 0x7f0900e2 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aD = v0;
v0 = this.aC;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.av = v0;
v0 = this.aD;
(( com.doodlemobile.basket.ui.AnimationView ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/ui/AnimationView;->s()Lcom/doodlemobile/basket/ui/b;
this.au = v0;
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->B()V */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->C()V */
v0 = this.M;
/* const v1, 0x7f0900e4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aE = v0;
v0 = this.M;
/* const v1, 0x7f0900ef */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aQ = v0;
v0 = this.M;
/* const v1, 0x7f0900ea */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aF = v0;
v0 = this.M;
/* const v1, 0x7f0900f6 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aJ = v0;
v0 = this.M;
/* const v1, 0x7f0900fb */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aK = v0;
v0 = this.M;
/* const v1, 0x7f090100 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aL = v0;
v0 = this.M;
/* const v1, 0x7f090105 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aM = v0;
v0 = this.M;
/* const v1, 0x7f090109 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aN = v0;
v0 = this.M;
/* const v1, 0x7f0900e6 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aG = v0;
v0 = this.M;
/* const v1, 0x7f0900e8 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aH = v0;
v0 = this.M;
/* const v1, 0x7f0900df */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.aI = v0;
v0 = this.M;
/* const v1, 0x7f0900d4 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/AnimationView; */
this.b = v0;
v0 = this.N;
/* const v1, 0x7f090091 */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/TextView; */
this.aO = v0;
v0 = this.Q;
this.S = v0;
v0 = this.M;
/* const v1, 0x7f0900bc */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast v0, Lcom/doodlemobile/basket/ui/UIViewGroup; */
this.P = v0;
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v1, 0x7f02009a */
com.doodlemobile.basket.graphics.e .a ( v0,v1 );
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v1, 0x7f02009b */
com.doodlemobile.basket.graphics.e .a ( v0,v1 );
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v1, 0x7f02009c */
com.doodlemobile.basket.graphics.e .a ( v0,v1 );
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
v0 = com.doodle.ltcsmyb.MainActivity.n;
/* const v1, 0x7f0200a0 */
com.doodlemobile.basket.graphics.e .a ( v0,v1 );
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
v0 = this.M;
int v1 = 0; // const/4 v1, 0x0
(( com.doodle.ltcsmyb.MainActivity ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->a(Lcom/doodlemobile/basket/ui/e;Lcom/doodlemobile/basket/s;)V
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->y()V */
return;
} // .end method
public final com.doodlemobile.basket.ui.a.p h ( ) {
/* .locals 1 */
v0 = this.g;
} // .end method
public final void i ( ) {
/* .locals 2 */
v0 = this.ac;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.ac;
int v1 = 0; // const/4 v1, 0x0
(( com.doodlemobile.basket.ui.ImageView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/ImageView;->a(Z)V
} // :cond_0
return;
} // .end method
public final void j ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x64 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* const/16 v2, 0x7d */
/* if-ge v0, v2, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v2 = (( com.doodle.ltcsmyb.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.aN;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/75"; // const-string v2, "/75"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void k ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
/* const/16 v2, 0x19 */
/* if-ge v0, v2, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v2 = (( com.doodle.ltcsmyb.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.aJ;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/75"; // const-string v2, "/75"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void l ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x19 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* const/16 v2, 0x32 */
/* if-ge v0, v2, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v2 = (( com.doodle.ltcsmyb.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.aK;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/75"; // const-string v2, "/75"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void m ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x32 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* const/16 v2, 0x4b */
/* if-ge v0, v2, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v2 = (( com.doodle.ltcsmyb.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.aL;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/75"; // const-string v2, "/75"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void n ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x4b */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* const/16 v2, 0x64 */
/* if-ge v0, v2, :cond_0 */
com.doodle.ltcsmyb.a.a .a ( p0 );
v2 = (( com.doodle.ltcsmyb.a.a ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lcom/doodle/ltcsmyb/a/a;->b(I)I
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.aM;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ""; // const-string v3, ""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/75"; // const-string v2, "/75"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.doodlemobile.basket.ui.TextView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final com.doodlemobile.basket.ui.e o ( ) {
/* .locals 1 */
v0 = this.M;
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* const/16 v0, 0x7dc */
/* if-ne p1, v0, :cond_0 */
/* packed-switch p2, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
/* invoke-direct {p0}, Lcom/doodle/ltcsmyb/MainActivity;->x()V */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/GameActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 4 */
int v3 = -1; // const/4 v3, -0x1
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/GameActivity;->onCreate(Landroid/os/Bundle;)V */
int v0 = 3; // const/4 v0, 0x3
(( com.doodle.ltcsmyb.MainActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->setVolumeControlStream(I)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->getWindowManager()Landroid/view/WindowManager;
v0 = this.o;
(( com.doodlemobile.basket.m ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/doodlemobile/basket/m;->a(Lcom/doodlemobile/basket/q;)V
(( com.doodle.ltcsmyb.MainActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MainActivity;->s()V
/* new-instance v0, Lcom/doodle/ltcsmyb/c/a; */
/* invoke-direct {v0, p0}, Lcom/doodle/ltcsmyb/c/a;-><init>(Landroid/content/Context;)V */
com.doodlemobile.gamecenter.cm .a ( p0 );
com.doodlemobile.gamecenter.z .a ( p0 );
com.doodle.ltcsmyb.f .a ( p0 );
final String v0 = "layout_inflater"; // const-string v0, "layout_inflater"
(( com.doodle.ltcsmyb.MainActivity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/LayoutInflater; */
/* const v1, 0x7f030020 */
int v2 = 0; // const/4 v2, 0x0
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
this.K = v0;
v0 = this.K;
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
(( com.doodle.ltcsmyb.MainActivity ) p0 ).addContentView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodle/ltcsmyb/MainActivity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
v0 = this.A;
/* const/16 v1, 0x6a */
(( android.os.Handler ) v0 ).sendEmptyMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
return;
} // .end method
public void onDestroy ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/GameActivity;->onDestroy()V */
com.doodle.ltcsmyb.f .c ( );
return;
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/GameActivity;->onPause()V */
v0 = this.cO;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.cO;
(( com.doodle.ltcsmyb.j ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/j;->c()V
} // :cond_0
v0 = this.cP;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.cP;
(( com.doodle.ltcsmyb.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodle/ltcsmyb/b;->c()V
} // :cond_1
return;
} // .end method
public void onResume ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/GameActivity;->onResume()V */
return;
} // .end method
protected void onStart ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/GameActivity;->onStart()V */
return;
} // .end method
protected void onStop ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/GameActivity;->onStop()V */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* iput-boolean p1, p0, Lcom/doodle/ltcsmyb/MainActivity;->q:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/MainActivity;->cW:Z */
} // :goto_0
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/GameActivity;->onWindowFocusChanged(Z)V */
return;
} // :cond_0
com.doodle.ltcsmyb.d.f .a ( p0 );
com.doodle.ltcsmyb.d.d .d ( );
} // .end method
public final com.doodlemobile.basket.ui.Panel p ( ) {
/* .locals 2 */
v0 = this.N;
/* const v1, 0x7f09006c */
(( com.doodlemobile.basket.ui.e ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/ui/e;->b(I)Lcom/doodlemobile/basket/ui/e;
/* check-cast p0, Lcom/doodlemobile/basket/ui/Panel; */
} // .end method
public final void q ( ) {
/* .locals 21 */
/* invoke-static/range {p0 ..p0}, Lcom/doodle/ltcsmyb/a/a;->a(Landroid/content/Context;)Lcom/doodle/ltcsmyb/a/a; */
(( com.doodle.ltcsmyb.a.a ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodle/ltcsmyb/a/a;->a()[I
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.bK = v0;
/* const/16 v2, 0x7d */
/* const/16 v3, 0x7d */
/* const/16 v4, 0x7d */
/* const/16 v5, 0x7d */
/* const/16 v6, 0x7d */
int v7 = 1; // const/4 v7, 0x1
int v8 = 1; // const/4 v8, 0x1
int v9 = 1; // const/4 v9, 0x1
int v10 = 1; // const/4 v10, 0x1
int v11 = 1; // const/4 v11, 0x1
int v12 = 0; // const/4 v12, 0x0
/* move/from16 v16, v12 */
/* move v12, v2 */
/* move/from16 v2, v16 */
/* move/from16 v17, v10 */
/* move v10, v4 */
/* move/from16 v4, v17 */
/* move/from16 v18, v8 */
/* move v8, v6 */
/* move/from16 v6, v18 */
/* move/from16 v19, v5 */
/* move v5, v9 */
/* move/from16 v9, v19 */
/* move/from16 v20, v3 */
/* move v3, v11 */
/* move/from16 v11, v20 */
} // :goto_0
/* const/16 v13, 0x7d */
/* if-ge v2, v13, :cond_e */
/* move-object/from16 v0, p0 */
v0 = this.bK;
/* move-object v13, v0 */
/* aget v13, v13, v2 */
/* if-lez v13, :cond_8 */
/* const/16 v13, 0x19 */
/* if-ge v2, v13, :cond_2 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c8 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :cond_0
} // :goto_1
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
int v14 = 1; // const/4 v14, 0x1
(( com.doodlemobile.basket.ui.TextView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* add-int/lit8 v14, v14, 0x2 */
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* move-object/from16 v0, p0 */
v0 = this.bK;
/* move-object v13, v0 */
/* aget v13, v13, v2 */
int v14 = 1; // const/4 v14, 0x1
/* if-le v13, v14, :cond_7 */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* add-int/lit8 v14, v14, 0x1 */
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* move-object/from16 v0, p0 */
v0 = this.bK;
/* move-object v13, v0 */
/* aget v13, v13, v2 */
int v14 = 2; // const/4 v14, 0x2
/* if-le v13, v14, :cond_6 */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_1
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
/* const/16 v13, 0x32 */
/* if-ge v2, v13, :cond_3 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c6 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :cond_3
/* const/16 v13, 0x4b */
/* if-ge v2, v13, :cond_4 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c4 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
} // :cond_4
/* const/16 v13, 0x64 */
/* if-ge v2, v13, :cond_5 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c7 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* goto/16 :goto_1 */
} // :cond_5
/* const/16 v13, 0x7d */
/* if-ge v2, v13, :cond_0 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c5 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* goto/16 :goto_1 */
} // :cond_6
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* aget-object v13, v13, v14 */
int v14 = 0; // const/4 v14, 0x0
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* add-int/lit8 v14, v14, 0x1 */
/* aget-object v13, v13, v14 */
int v14 = 0; // const/4 v14, 0x0
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v13, v0 */
/* mul-int/lit8 v14, v2, 0x3 */
/* aget-object v13, v13, v14 */
int v14 = 0; // const/4 v14, 0x0
(( com.doodlemobile.basket.ui.AnimationView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
} // :cond_8
/* const/16 v13, 0x19 */
/* if-ge v2, v13, :cond_a */
if ( v7 != null) { // if-eqz v7, :cond_9
int v7 = 0; // const/4 v7, 0x0
/* move v12, v2 */
} // :cond_9
} // :goto_3
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
/* const v14, 0x7f0901c2 */
(( com.doodlemobile.basket.ui.Button ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v13, v0 */
/* aget-object v13, v13, v2 */
int v14 = 0; // const/4 v14, 0x0
(( com.doodlemobile.basket.ui.TextView ) v13 ).a ( v14 ); // invoke-virtual {v13, v14}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
int v13 = 0; // const/4 v13, 0x0
} // :goto_4
int v14 = 3; // const/4 v14, 0x3
/* if-ge v13, v14, :cond_1 */
/* move-object/from16 v0, p0 */
v0 = this.aR;
/* move-object v14, v0 */
/* mul-int/lit8 v15, v2, 0x3 */
/* add-int/2addr v15, v13 */
/* aget-object v14, v14, v15 */
int v15 = 0; // const/4 v15, 0x0
(( com.doodlemobile.basket.ui.AnimationView ) v14 ).a ( v15 ); // invoke-virtual {v14, v15}, Lcom/doodlemobile/basket/ui/AnimationView;->a(Z)V
/* add-int/lit8 v13, v13, 0x1 */
} // :cond_a
/* const/16 v13, 0x32 */
/* if-ge v2, v13, :cond_b */
if ( v6 != null) { // if-eqz v6, :cond_9
int v6 = 0; // const/4 v6, 0x0
/* move v11, v2 */
} // :cond_b
/* const/16 v13, 0x4b */
/* if-ge v2, v13, :cond_c */
if ( v5 != null) { // if-eqz v5, :cond_9
int v5 = 0; // const/4 v5, 0x0
/* move v10, v2 */
} // :cond_c
/* const/16 v13, 0x64 */
/* if-ge v2, v13, :cond_d */
if ( v4 != null) { // if-eqz v4, :cond_9
int v4 = 0; // const/4 v4, 0x0
/* move v9, v2 */
} // :cond_d
/* const/16 v13, 0x7d */
/* if-ge v2, v13, :cond_9 */
if ( v3 != null) { // if-eqz v3, :cond_9
int v3 = 0; // const/4 v3, 0x0
/* move v8, v2 */
} // :cond_e
/* const/16 v2, 0x19 */
/* if-ge v12, v2, :cond_f */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v2, v0 */
/* aget-object v2, v2, v12 */
/* const v3, 0x7f0901c8 */
(( com.doodlemobile.basket.ui.Button ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v2, v0 */
/* aget-object v2, v2, v12 */
int v3 = 1; // const/4 v3, 0x1
(( com.doodlemobile.basket.ui.TextView ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
} // :cond_f
/* const/16 v2, 0x32 */
/* if-ge v11, v2, :cond_10 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v2, v0 */
/* aget-object v2, v2, v11 */
/* const v3, 0x7f0901c6 */
(( com.doodlemobile.basket.ui.Button ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v2, v0 */
/* aget-object v2, v2, v11 */
int v3 = 1; // const/4 v3, 0x1
(( com.doodlemobile.basket.ui.TextView ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
} // :cond_10
/* const/16 v2, 0x4b */
/* if-ge v10, v2, :cond_11 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v2, v0 */
/* aget-object v2, v2, v10 */
/* const v3, 0x7f0901c4 */
(( com.doodlemobile.basket.ui.Button ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v2, v0 */
/* aget-object v2, v2, v10 */
int v3 = 1; // const/4 v3, 0x1
(( com.doodlemobile.basket.ui.TextView ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
} // :cond_11
/* const/16 v2, 0x64 */
/* if-ge v9, v2, :cond_12 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v2, v0 */
/* aget-object v2, v2, v9 */
/* const v3, 0x7f0901c7 */
(( com.doodlemobile.basket.ui.Button ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v2, v0 */
/* aget-object v2, v2, v9 */
int v3 = 1; // const/4 v3, 0x1
(( com.doodlemobile.basket.ui.TextView ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
} // :cond_12
/* const/16 v2, 0x7d */
/* if-ge v8, v2, :cond_13 */
/* move-object/from16 v0, p0 */
v0 = this.aS;
/* move-object v2, v0 */
/* aget-object v2, v2, v8 */
/* const v3, 0x7f0901c5 */
(( com.doodlemobile.basket.ui.Button ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/Button;->a(I)V
/* move-object/from16 v0, p0 */
v0 = this.aP;
/* move-object v2, v0 */
/* aget-object v2, v2, v8 */
int v3 = 1; // const/4 v3, 0x1
(( com.doodlemobile.basket.ui.TextView ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lcom/doodlemobile/basket/ui/TextView;->a(Z)V
} // :cond_13
return;
} // .end method
