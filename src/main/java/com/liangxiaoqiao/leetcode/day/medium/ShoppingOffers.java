package com.liangxiaoqiao.leetcode.day.medium;


import java.util.List;
    

/*
 * English
 * id: 638
 * title: Shopping Offers
 * href: https://leetcode.com/problems/shopping-offers
 * desc: In LeetCode Store, there are some kinds of items to sell. Each item has a price.
 * However, there are some special offers, and a special offer consists of one or more different kinds of items with a sale price.
 * You are given the each item's price, a set of special offers, and the number we need to buy for each item. The job is to output the lowest price you have to pay for exactly certain items as given, where you could make optimal use of the special offers.
 * Each special offer is represented in the form of an array, the last number represents the price you need to pay for this special offer, other numbers represents how many specific items you could get if you buy this offer.
 * You could use any of special offers as many times as you want.
 * Example 1:
 * Input: [2,5], [[3,0,5],[1,2,10]], [3,2]
 * Output: 14
 * Explanation:
 * There are two kinds of items, A and B. Their prices are $2 and $5 respectively.
 * In special offer 1, you can pay $5 for 3A and 0B
 * In special offer 2, you can pay $10 for 1A and 2B.
 * You need to buy 3A and 2B, so you may pay $10 for 1A and 2B (special offer #2), and $4 for 2A.
 * Example 2:
 * Input: [2,3,4], [[1,1,0,4],[2,2,1,9]], [1,2,1]
 * Output: 11
 * Explanation:
 * The price of A is $2, and $3 for B, $4 for C.
 * You may pay $4 for 1A and 1B, and $9 for 2A ,2B and 1C.
 * You need to buy 1A ,2B and 1C, so you may pay $4 for 1A and 1B (special offer #1), and $3 for 1B, $4 for 1C.
 * You cannot add more items, though only $9 for 2A ,2B and 1C.
 * Note:
 * There are at most 6 kinds of items, 100 special offers.
 * For each item, you need to buy at most 6 of them.
 * You are not allowed to buy more items than you want, even if that would lower the overall price.
 * <p>
 * 中文
 * 序号: 638
 * 标题： 大礼包
 * 链接： https://leetcode-cn.com/problems/shopping-offers
 * 描述： 在LeetCode商店中， 有许多在售的物品。\n然而，也有一些大礼包，每个大礼包以优惠的价格捆绑销售一组物品。\n现给定每个物品的价格，每个大礼包包含物品的清单，以及待购物品清单。请输出确切完成待购清单的最低花费。\n每个大礼包的由一个数组中的一组数据描述，最后一个数字代表大礼包的价格，其他数字分别表示内含的其他种类物品的数量。\n任意大礼包可无限次购买。\n示例 1:\n输入: [2,5], [[3,0,5],[1,2,10]], [3,2]\n输出: 14\n解释: \n有A和B两种物品，价格分别为¥2和¥5。\n大礼包1，你可以以¥5的价格购买3A和0B。\n大礼包2， 你可以以¥10的价格购买1A和2B。\n你需要购买3个A和2个B， 所以你付了¥10购买了1A和2B（大礼包2），以及¥4购买2A。\n示例 2:\n输入: [2,3,4], [[1,1,0,4],[2,2,1,9]], [1,2,1]\n输出: 11\n解释: \nA，B，C的价格分别为¥2，¥3，¥4.\n你可以用¥4购买1A和2B，也可以用¥9购买2A，2B和1C。\n你需要买1A，2B和1C，所以你付了¥4买了1A和1B（大礼包1），以及¥3购买1B， ¥4购买1C。\n你不可以购买超出待购清单的物品，尽管购买大礼包2更加便宜。\n说明:\n最多6种物品， 100种大礼包。\n每种物品，你最多只需要购买6个。\n你不可以购买超出待购清单的物品，即使更便宜。
 * <p>
 * acceptance: 50.3%
 * difficulty: Medium
 * private: False
 */


//TODO init
public class ShoppingOffers {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return 0;
    }
}