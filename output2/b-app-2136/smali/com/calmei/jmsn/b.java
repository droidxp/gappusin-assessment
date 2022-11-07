class com.calmei.jmsn.b implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 final com.calmei.jmsn.PlaneFightActivity a; //synthetic
	 /* # direct methods */
	 com.calmei.jmsn.b ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = com.calmei.jmsn.PlaneFightActivity.a;
		 (( com.calmei.jmsn.PlaneFightActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/calmei/jmsn/PlaneFightActivity;->finish()V
		 int v0 = 0; // const/4 v0, 0x0
		 java.lang.System .exit ( v0 );
		 return;
	 } // .end method
