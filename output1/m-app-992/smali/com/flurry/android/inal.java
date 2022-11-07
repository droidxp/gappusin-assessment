class inal extends android.widget.LinearLayout {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 6 */
		 int v5 = -2; // const/4 v5, -0x2
		 int v4 = 0; // const/4 v4, 0x0
		 /* invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 int v0 = -1; // const/4 v0, -0x1
		 (( com.flurry.android.s ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/flurry/android/s;->setBackgroundColor(I)V
		 com.flurry.android.CatalogActivity .c ( p1 );
		 (( com.flurry.android.u ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->j()Lcom/flurry/android/AdImage;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* new-instance v1, Landroid/widget/ImageView; */
			 /* invoke-direct {v1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
			 /* const/16 v2, 0x2710 */
			 (( android.widget.ImageView ) v1 ).setId ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setId(I)V
			 v2 = this.e;
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* array-length v3, v2 */
				 android.graphics.BitmapFactory .decodeByteArray ( v2,v4,v3 );
				 (( android.widget.ImageView ) v1 ).setImageBitmap ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
			 } // :cond_0
			 /* iget v2, v0, Lcom/flurry/android/AdImage;->b:I */
			 v2 = 			 com.flurry.android.r .a ( p2,v2 );
			 /* iget v0, v0, Lcom/flurry/android/AdImage;->c:I */
			 v0 = 			 com.flurry.android.r .a ( p2,v0 );
			 com.flurry.android.r .a ( p2,v1,v2,v0 );
			 /* new-instance v0, Landroid/widget/LinearLayout$LayoutParams; */
			 /* invoke-direct {v0, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
			 int v2 = -3; // const/4 v2, -0x3
			 (( android.widget.LinearLayout$LayoutParams ) v0 ).setMargins ( v4, v4, v4, v2 ); // invoke-virtual {v0, v4, v4, v4, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
			 int v2 = 3; // const/4 v2, 0x3
			 (( com.flurry.android.s ) p0 ).setGravity ( v2 ); // invoke-virtual {p0, v2}, Lcom/flurry/android/s;->setGravity(I)V
			 (( com.flurry.android.s ) p0 ).addView ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/flurry/android/s;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 } // :cond_1
		 return;
	 } // .end method
