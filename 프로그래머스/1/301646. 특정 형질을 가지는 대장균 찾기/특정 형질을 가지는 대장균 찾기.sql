select count(*) as count
from (
    select conv(genotype, 10, 2) as genotype
    from ecoli_data
    where conv(genotype, 10, 2) not like '%1_'
) as ecoli_data
where genotype like '%1' or genotype like '%1__'