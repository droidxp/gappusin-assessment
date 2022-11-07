public class com.doodle.ltcsmyb.MapPanel extends com.doodlemobile.basket.ui.Panel {
	 /* # instance fields */
	 private Boolean t;
	 private Float u;
	 private Float v;
	 private Float w;
	 private Long x;
	 private Float y;
	 /* # direct methods */
	 private void d ( Object p0 ) {
		 /* .locals 6 */
		 /* const/high16 v5, 0x44700000 # 960.0f */
		 v0 = this.c;
		 /* iget v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->y:F */
		 v2 = 		 (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
		 /* add-float/2addr v1, v2 */
		 /* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
		 (( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
		 /* move-result-wide v0 */
		 /* iget-wide v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->x:J */
		 /* sub-long/2addr v0, v2 */
		 /* const-wide/16 v2, 0x0 */
		 /* cmp-long v2, v0, v2 */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
			 /* const v3, 0x3f19999a # 0.6f */
			 /* mul-float/2addr v2, v3 */
			 v3 = this.c;
			 /* iget v3, v3, Lcom/doodlemobile/basket/ui/b;->c:F */
			 /* iget v4, p0, Lcom/doodle/ltcsmyb/MapPanel;->w:F */
			 /* sub-float/2addr v3, v4 */
			 /* long-to-float v4, v0 */
			 /* div-float/2addr v3, v4 */
			 /* const v4, 0x3ecccccd # 0.4f */
			 /* mul-float/2addr v3, v4 */
			 /* add-float/2addr v2, v3 */
			 /* iput v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
		 } // :cond_0
		 v2 = this.c;
		 /* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->c:F */
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->w:F */
		 /* iget-wide v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->x:J */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->x:J */
		 v0 = this.c;
		 /* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 /* cmpl-float v0, v0, v5 */
		 /* if-lez v0, :cond_1 */
		 v0 = this.c;
		 v1 = this.c;
		 /* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
		 v1 = 		 java.lang.Math .signum ( v1 );
		 /* mul-float/2addr v1, v5 */
		 /* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
	 } // :cond_1
	 (( com.doodle.ltcsmyb.MapPanel ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MapPanel;->q()V
	 return;
} // .end method
/* # virtual methods */
public final void a ( Long p0 ) {
	 /* .locals 7 */
	 int v6 = 0; // const/4 v6, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->t:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* long-to-float v0, p1 */
		 /* const v1, 0x3a83126f # 0.001f */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.c;
		 /* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
		 /* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
		 /* cmpg-float v1, v1, v2 */
		 /* if-gez v1, :cond_3 */
		 /* const/high16 v1, 0x41200000 # 10.0f */
	 } // :goto_0
	 /* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, v2 */
	 /* iput v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
	 v0 = this.c;
	 /* iget v2, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
	 /* iget v3, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
	 /* long-to-float v4, p1 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 /* iput v2, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
	 /* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
	 v2 = this.c;
	 /* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->c:F */
	 /* sub-float/2addr v0, v2 */
	 /* mul-float/2addr v0, v1 */
	 /* cmpg-float v0, v0, v5 */
	 /* if-gtz v0, :cond_0 */
	 v0 = this.c;
	 /* iget v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
	 /* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
	 /* iput-boolean v6, p0, Lcom/doodle/ltcsmyb/MapPanel;->t:Z */
	 /* iput v5, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
} // :cond_0
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v0 = java.lang.Math .abs ( v0 );
/* const v1, 0x441d8000 # 630.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
v0 = this.c;
v1 = this.c;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = java.lang.Math .signum ( v1 );
/* const/high16 v2, 0x44700000 # 960.0f */
/* mul-float/2addr v1, v2 */
/* iput v1, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iput-boolean v6, p0, Lcom/doodle/ltcsmyb/MapPanel;->t:Z */
/* iput v5, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
} // :cond_1
(( com.doodle.ltcsmyb.MapPanel ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/MapPanel;->q()V
} // :cond_2
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->a(J)V */
return;
} // :cond_3
/* const/high16 v1, -0x3ee00000 # -10.0f */
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->q:I */
/* if-ge v0, v1, :cond_0 */
v1 = this.a;
/* aget-object v1, v1, v0 */
(( com.doodlemobile.basket.ui.e ) v1 ).s ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
/* const/high16 v2, -0x3b900000 # -960.0f */
/* const/high16 v3, 0x43f00000 # 480.0f */
/* int-to-float v4, v0 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iput v2, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/Panel;->a(ZFFFF)V */
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 5 */
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
v2 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
if ( v2 != null) { // if-eqz v2, :cond_0
v3 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
int v4 = 4; // const/4 v4, 0x4
/* if-ne v3, v4, :cond_0 */
int v2 = 3; // const/4 v2, 0x3
(( com.doodlemobile.basket.util.e ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lcom/doodlemobile/basket/util/e;->a(I)V
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->a(FF)V
int v0 = 0; // const/4 v0, 0x0
(( com.doodlemobile.basket.util.e ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/basket/util/e;->a(I)V
v0 = (( com.doodle.ltcsmyb.MapPanel ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodle/ltcsmyb/MapPanel;->c(Lcom/doodlemobile/basket/util/e;)Z
} // :goto_0
} // :cond_0
/* move v0, v2 */
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* const/high16 v5, 0x43f00000 # 480.0f */
/* const/high16 v2, 0x3fc00000 # 1.5f */
int v4 = 0; // const/4 v4, 0x0
int v3 = 3; // const/4 v3, 0x3
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* :pswitch_0 */
final String v0 = "onTouchEvent----------------------------"; // const-string v0, "onTouchEvent----------------------------"
final String v1 = "ACTION_DOWN"; // const-string v1, "ACTION_DOWN"
android.util.Log .i ( v0,v1 );
/* iput-boolean v6, p0, Lcom/doodle/ltcsmyb/MapPanel;->t:Z */
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->y:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->x:J */
/* :pswitch_1 */
/* invoke-direct {p0, p1}, Lcom/doodle/ltcsmyb/MapPanel;->d(Lcom/doodlemobile/basket/util/e;)V */
/* :pswitch_2 */
final String v0 = "onTouchEvent----------------------------"; // const-string v0, "onTouchEvent----------------------------"
final String v1 = "ACTION_UP"; // const-string v1, "ACTION_UP"
android.util.Log .i ( v0,v1 );
/* invoke-direct {p0, p1}, Lcom/doodle/ltcsmyb/MapPanel;->d(Lcom/doodlemobile/basket/util/e;)V */
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->c:F */
/* const/high16 v1, 0x44700000 # 960.0f */
/* div-float/2addr v0, v1 */
/* sub-float v0, v2, v0 */
v0 = java.lang.Math .round ( v0 );
/* if-gez v0, :cond_0 */
/* move v0, v6 */
} // :cond_0
/* if-lt v0, v3, :cond_1 */
/* move v0, v3 */
} // :cond_1
/* int-to-float v1, v0 */
/* sub-float v1, v2, v1 */
/* mul-float/2addr v1, v5 */
/* iput v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
v1 = this.c;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
/* sub-float/2addr v1, v2 */
v1 = java.lang.Math .signum ( v1 );
/* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
v2 = java.lang.Math .signum ( v2 );
/* cmpl-float v1, v1, v2 */
/* if-nez v1, :cond_4 */
v1 = this.c;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->c:F */
/* iget v2, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
/* sub-float/2addr v1, v2 */
v1 = java.lang.Math .abs ( v1 );
/* const/high16 v2, 0x42f00000 # 120.0f */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_4 */
/* if-nez v0, :cond_2 */
/* iget v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
/* cmpl-float v1, v1, v4 */
/* if-gtz v1, :cond_4 */
} // :cond_2
/* if-ne v0, v3, :cond_3 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
/* cmpg-float v0, v0, v4 */
/* if-ltz v0, :cond_4 */
} // :cond_3
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
/* iget v1, p0, Lcom/doodle/ltcsmyb/MapPanel;->v:F */
v1 = java.lang.Math .signum ( v1 );
/* mul-float/2addr v1, v5 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->u:F */
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->t:Z */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public final Boolean e ( Float p0, Float p1 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->d:Z */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->j:F */
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->l:F */
/* cmpg-float v0, p1, v0 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->k:F */
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodle/ltcsmyb/MapPanel;->m:F */
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move v0, v1 */
} // .end method
