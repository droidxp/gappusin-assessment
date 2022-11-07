class inal extends android.os.AsyncTask {
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, [Landroid/content/Context; */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget-object v0, p1, v0 */
		 v0 = 		 com.doodlemobile.gamecenter.d.d .b ( v0 );
		 java.lang.Boolean .valueOf ( v0 );
	 } // .end method
	 protected final void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 3 */
		 /* check-cast p1, Ljava/lang/Boolean; */
		 try { // :try_start_0
			 v0 = 			 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
			 int v1 = 1; // const/4 v1, 0x1
			 /* if-ne v0, v1, :cond_0 */
			 com.doodlemobile.gamecenter.d.d .c ( );
			 v0 = 			 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* if-ge v1, v0, :cond_0 */
		 com.doodlemobile.gamecenter.d.d .c ( );
		 (( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lcom/doodlemobile/gamecenter/FeatureView; */
		 (( com.doodlemobile.gamecenter.FeatureView ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/FeatureView;->a()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* add-int/lit8 v1, v1, 0x1 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // :cond_0
	 return;
} // .end method
