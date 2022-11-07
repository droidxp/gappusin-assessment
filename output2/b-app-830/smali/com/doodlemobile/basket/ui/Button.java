public class com.doodlemobile.basket.ui.Button extends com.doodlemobile.basket.ui.AnimationView {
	 /* # instance fields */
	 public com.doodlemobile.basket.ui.f q;
	 private com.doodlemobile.basket.ui.a r;
	 private Integer s;
	 private Integer t;
	 private Integer u;
	 private Integer v;
	 private Boolean w;
	 private Boolean x;
	 private Boolean y;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.Button ( ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = -1; // const/4 v3, -0x1
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/AnimationView;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 this.r = v1;
		 this.q = v1;
		 /* iput-boolean v4, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/Button;->x:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
		 v0 = 		 final String v0 = "action"; // const-string v0, "action"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Button;->s:I */
		 v0 = 		 final String v0 = "downaction"; // const-string v0, "downaction"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Button;->t:I */
		 v0 = 		 final String v0 = "activeaction"; // const-string v0, "activeaction"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Button;->u:I */
		 v0 = 		 final String v0 = "disableaction"; // const-string v0, "disableaction"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Button;->v:I */
		 v0 = 		 final String v0 = "enabled"; // const-string v0, "enabled"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
		 v0 = 		 final String v0 = "disabled"; // const-string v0, "disabled"
		 /* if-ne v0, v4, :cond_0 */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
	 } // :cond_0
	 v0 = 	 final String v0 = "actived"; // const-string v0, "actived"
	 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->x:Z */
	 /* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/Button;->e()V */
	 return;
} // .end method
public com.doodlemobile.basket.ui.Button ( ) {
	 /* .locals 3 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 int v1 = -1; // const/4 v1, -0x1
	 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/AnimationView;-><init>(Lcom/doodlemobile/basket/b/b;Lcom/doodlemobile/basket/graphics/Animation;)V */
	 this.r = v0;
	 this.q = v0;
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
	 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/Button;->x:Z */
	 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
	 /* const v0, 0x7f0901c2 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Button;->s:I */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/Button;->t:I */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/Button;->u:I */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/Button;->v:I */
	 /* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/Button;->e()V */
	 return;
} // .end method
private void e ( ) {
	 /* .locals 2 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
		 /* if-nez v0, :cond_2 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->v:I */
		 /* if-ltz v0, :cond_1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->v:I */
	 } // :goto_0
	 v1 = 	 v1 = this.a;
	 /* if-eq v0, v1, :cond_0 */
	 v1 = this.a;
} // :cond_0
return;
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->s:I */
} // :cond_2
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->t:I */
/* if-ltz v0, :cond_3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->t:I */
} // :cond_3
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->u:I */
/* if-ltz v0, :cond_4 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->u:I */
} // :cond_4
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Button;->s:I */
} // .end method
/* # virtual methods */
public final void a ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/Button;->s:I */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/Button;->e()V */
return;
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Button;->w:Z */
/* if-nez v0, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
v2 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* packed-switch v2, :pswitch_data_0 */
} // :cond_1
} // :goto_1
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/Button;->e()V */
/* move v0, v4 */
/* :pswitch_0 */
v2 = this.q;
if ( v2 != null) { // if-eqz v2, :cond_2
v0 = (( com.doodlemobile.basket.ui.Button ) p0 ).e ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/Button;->e(FF)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.q;
} // :cond_2
/* iput-boolean v4, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
/* :pswitch_1 */
v0 = (( com.doodlemobile.basket.ui.Button ) p0 ).e ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/Button;->e(FF)Z
/* if-nez v0, :cond_3 */
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_3
/* iput-boolean v4, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
/* :pswitch_2 */
(( com.doodlemobile.basket.ui.Button ) p0 ).e ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/Button;->e(FF)Z
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.q;
} // :cond_4
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
/* :pswitch_3 */
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/Button;->y:Z */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
