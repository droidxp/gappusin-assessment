public class de.hellowins.game.HellowinsView extends android.widget.FrameLayout implements de.hellowins.HellowinsUpdateHandler {
	 /* .source "HellowinsView.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.graphics.Paint mBackgroundPaint;
	 java.lang.String mRank;
	 private android.graphics.Paint mTextPaint;
	 java.lang.String mTime;
	 android.widget.TextView rank;
	 android.widget.TextView time;
	 /* # direct methods */
	 public de.hellowins.game.HellowinsView ( ) {
		 /* .locals 6 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 /* const/high16 v5, -0x1000000 */
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 int v3 = -2; // const/4 v3, -0x2
		 /* .line 33 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 38 */
		 /* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
		 /* invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
		 /* .line 41 */
		 /* .local v1, "lptime":Landroid/widget/FrameLayout$LayoutParams; */
		 int v2 = 3; // const/4 v2, 0x3
		 /* iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
		 /* .line 43 */
		 /* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
		 /* invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
		 /* .line 46 */
		 /* .local v0, "lprank":Landroid/widget/FrameLayout$LayoutParams; */
		 int v2 = 5; // const/4 v2, 0x5
		 /* iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
		 /* .line 48 */
		 /* new-instance v2, Landroid/widget/TextView; */
		 /* invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 this.time = v2;
		 /* .line 49 */
		 v2 = this.time;
		 (( android.widget.TextView ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 50 */
		 v2 = this.time;
		 (( android.widget.TextView ) v2 ).setTextColor ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V
		 /* .line 51 */
		 v2 = this.time;
		 final String v3 = "Time: 00:00"; // const-string v3, "Time: 00:00"
		 (( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 52 */
		 v2 = this.time;
		 (( android.widget.TextView ) v2 ).setTextSize ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V
		 /* .line 53 */
		 v2 = this.time;
		 (( de.hellowins.game.HellowinsView ) p0 ).addView ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/game/HellowinsView;->addView(Landroid/view/View;)V
		 /* .line 55 */
		 /* new-instance v2, Landroid/widget/TextView; */
		 /* invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 this.rank = v2;
		 /* .line 56 */
		 v2 = this.rank;
		 (( android.widget.TextView ) v2 ).setLayoutParams ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 57 */
		 v2 = this.rank;
		 (( android.widget.TextView ) v2 ).setTextColor ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V
		 /* .line 58 */
		 v2 = this.rank;
		 final String v3 = "Rank: 0 / 0"; // const-string v3, "Rank: 0 / 0"
		 (( android.widget.TextView ) v2 ).setText ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 59 */
		 v2 = this.rank;
		 (( android.widget.TextView ) v2 ).setTextSize ( v4 ); // invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V
		 /* .line 60 */
		 v2 = this.rank;
		 (( de.hellowins.game.HellowinsView ) p0 ).addView ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/game/HellowinsView;->addView(Landroid/view/View;)V
		 /* .line 61 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void apiUpdate ( de.hellowins.game.data.HellowinsResponseData p0 ) {
		 /* .locals 4 */
		 /* .param p1, "data" # Lde/hellowins/game/data/HellowinsResponseData; */
		 /* .prologue */
		 /* .line 85 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "Rank: "; // const-string v3, "Rank: "
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
		 v3 = this.rank;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 86 */
		 /* .local v0, "outRank":Ljava/lang/String; */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "Time: "; // const-string v3, "Time: "
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( de.hellowins.game.data.HellowinsResponseData ) p1 ).getUser ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
		 v3 = this.time;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 88 */
		 /* .local v1, "outTime":Ljava/lang/String; */
		 v2 = 		 (( de.hellowins.game.data.HellowinsResponseData ) p1 ).isGameRunning ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->isGameRunning()Z
		 /* if-nez v2, :cond_0 */
		 /* .line 89 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v3 = " r:"; // const-string v3, " r:"
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v3 = 		 (( de.hellowins.game.data.HellowinsResponseData ) p1 ).isGameRunning ( ); // invoke-virtual {p1}, Lde/hellowins/game/data/HellowinsResponseData;->isGameRunning()Z
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 92 */
	 } // :cond_0
	 v2 = this.time;
	 (( android.widget.TextView ) v2 ).setText ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 93 */
	 v2 = this.rank;
	 (( android.widget.TextView ) v2 ).setText ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 94 */
	 return;
} // .end method
public void drawView ( android.graphics.Canvas p0 ) {
	 /* .locals 0 */
	 /* .param p1, "canvas" # Landroid/graphics/Canvas; */
	 /* .prologue */
	 /* .line 78 */
	 return;
} // .end method
public void onAttachedToWindow ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 74 */
	 de.hellowins.Hellowins .getInstance ( );
	 /* .line 75 */
	 return;
} // .end method
