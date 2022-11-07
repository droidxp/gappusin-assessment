class inal implements org.anddev.andengine.engine.handler.timer.ITimerCallback {
	 /* # interfaces */
	 /* # instance fields */
	 private com.tgb.bg.jevcyxq.b.q a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onTimePassed ( org.anddev.andengine.engine.handler.timer.TimerHandler p0 ) {
		 /* .locals 4 */
		 /* const v2, 0x3f3d70a4 # 0.74f */
		 v0 = this.a;
		 /* iget v1, v0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
		 /* add-int/lit8 v1, v1, 0x1 */
		 /* iput v1, v0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
		 v0 = this.a;
		 /* iget v0, v0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
		 /* const/16 v1, 0x1e */
		 /* if-le v0, v1, :cond_1 */
		 v0 = this.a;
		 v1 = this.a;
		 v1 = 		 (( com.tgb.bg.jevcyxq.b.q ) v1 ).getX ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/q;->getX()F
		 /* add-float/2addr v1, v2 */
		 v2 = this.a;
		 v2 = 		 (( com.tgb.bg.jevcyxq.b.q ) v2 ).getY ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/q;->getY()F
		 /* const v3, 0x3eaf837b # 0.3428f */
		 /* sub-float/2addr v2, v3 */
		 (( com.tgb.bg.jevcyxq.b.q ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/q;->setPosition(FF)V
		 v0 = this.a;
		 v1 = this.a;
		 v1 = 		 (( com.tgb.bg.jevcyxq.b.q ) v1 ).getRotation ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/q;->getRotation()F
		 /* const v2, 0x3fa47ae1 # 1.285f */
		 /* sub-float/2addr v1, v2 */
		 (( com.tgb.bg.jevcyxq.b.q ) v0 ).setRotation ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->setRotation(F)V
	 } // :goto_0
	 v0 = this.a;
	 /* iget v0, v0, Lcom/tgb/bg/jevcyxq/b/q;->c:I */
	 /* const/16 v1, 0x64 */
	 /* if-ne v0, v1, :cond_0 */
	 v0 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.tgb.bg.jevcyxq.b.q ) v0 ).setRotation ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/b/q;->setRotation(F)V
	 v0 = this.a;
	 v1 = this.a;
	 /* iget v1, v1, Lcom/tgb/bg/jevcyxq/b/q;->f:F */
	 v2 = this.a;
	 v2 = 	 (( com.tgb.bg.jevcyxq.b.q ) v2 ).getY ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/q;->getY()F
	 (( com.tgb.bg.jevcyxq.b.q ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/q;->setPosition(FF)V
	 v0 = this.a;
	 v1 = this.a;
	 v1 = 	 com.tgb.bg.jevcyxq.b.q .e ( v1 );
	 com.tgb.bg.jevcyxq.b.q .c ( v0,v1 );
	 v0 = this.a;
	 v1 = this.a;
	 v1 = 	 com.tgb.bg.jevcyxq.b.q .d ( v1 );
	 com.tgb.bg.jevcyxq.b.q .a ( v0,v1 );
	 v0 = this.a;
	 v1 = 	 com.tgb.bg.jevcyxq.b.q .c ( v0 );
	 /* add-int/lit8 v1, v1, 0x1 */
	 com.tgb.bg.jevcyxq.b.q .c ( v0,v1 );
	 v0 = this.a;
	 int v1 = 4; // const/4 v1, 0x4
	 com.tgb.bg.jevcyxq.b.q .b ( v0,v1 );
	 v0 = this.a;
	 (( com.tgb.bg.jevcyxq.b.q ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/b/q;->i()V
} // :cond_0
return;
} // :cond_1
v0 = this.a;
v1 = this.a;
v1 = (( com.tgb.bg.jevcyxq.b.q ) v1 ).getX ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/b/q;->getX()F
/* add-float/2addr v1, v2 */
v2 = this.a;
v2 = (( com.tgb.bg.jevcyxq.b.q ) v2 ).getY ( ); // invoke-virtual {v2}, Lcom/tgb/bg/jevcyxq/b/q;->getY()F
(( com.tgb.bg.jevcyxq.b.q ) v0 ).setPosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/tgb/bg/jevcyxq/b/q;->setPosition(FF)V
} // .end method
