​Math.max fonksiyonu
Math.max(a,b) a>b ise //a 
              a<b ise //b
Math.max(8,8) a=b ise //a ya da b  //8

maxArea = Math.max(maxArea,height[start]*(end-start));
hangisi max ise yeni maxArea değeri o olur.


while(start < end)
        {
            if(height[start] < height[end])
            {
                maxArea = Math.max(maxArea,height[start]*(end-start));
                start +=1;
            }

height[start]*(end-start)  küçük olanla çarparız çünkü sınırı o belirler.
![WhatsApp Image 2024-05-05 at 15 10 41](https://github.com/dilrubaoner/LeetCode/assets/120575389/e75300e9-3c33-4f0b-85e1-316c06383ba0)
